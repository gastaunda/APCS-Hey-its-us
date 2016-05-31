package oggVorbis;

import java.io.IOException;

import org.newdawn.easyogg.OggClip;

public class Music {
	private OggClip start;
	private OggClip loop;
	private OggClip ending;
	private Thread player;
	private boolean play;
	private boolean finish;

	public Music(String start, String loop, String ending) {
		try {
			this.start = new OggClip(start);
			this.loop = new OggClip(loop);
			this.ending = new OggClip(ending);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Music(String start, String loop) {
		try {
			this.start = new OggClip(start);
			this.loop = new OggClip(loop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Music(String loop) {
		try {
			this.loop = new OggClip(loop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Music() {
		this("assets/audio/music/Local Forecast - Elevator.ogg");
	}

	public void play() {
		play = true;
		player = new Thread() {
			public void run() {
				if (start != null) {
					start.play();
					while (!start.stopped())
						if (!play)
							return;
					try {
						Thread.sleep(418);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				loop.play();
				while (!loop.stopped())
					if (!play)
						return;
				if (ending != null) {
					try {
						Thread.sleep(418);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ending.play();
				}
			}
		};
		player.start();
	}

	public void loop() {
		finish = false;
		play = true;
		player = new Thread() {
			public void run() {
				if (start != null) {
					start.play();
					while (!start.stopped())
						if (!play)
							return;
					try {
						Thread.sleep(418);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				loop.loop();
				while (!loop.stopped() && finish)
					if (!play)
						return;
				if (ending != null) {
					try {
						Thread.sleep(418);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ending.play();
				}
			}
		};
		player.start();
	}
	public void end() {
		finish = true;
	}

	public void stop() {
		play = false;
		if (start != null)
			start.stop();
		loop.stop();
		if (ending != null)
			ending.stop();
	}

	public void close() {
		stop();
		if (start != null)
			start.close();
		loop.close();
	}

	public void pause() {
		if (start != null && !start.stopped())
			start.pause();
		else
			loop.pause();
	}

	public void unpause() {
		if (start != null && !start.stopped())
			start.resume();
		else
			loop.resume();
	}

	public boolean isPaused() {
		return loop.isPaused() || (start != null && start.isPaused());
	}

	public boolean stopped() {
		return loop.stopped() && (start == null || start.stopped());
	}
}
