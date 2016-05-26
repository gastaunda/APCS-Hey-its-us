package aa;
import java.io.IOException;

import org.newdawn.easyogg.OggClip;

public class Music {
	private OggClip loop;
	private OggClip start;
	private Thread player;

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

	public void play() {
		player = new Thread() {
			public void run() {
				if (start != null) {
					start.play();
					while (!start.stopped())
						;
				}
				loop.play();
			}
		};
		player.start();
	}

	public void loop() {
		player = new Thread() {
			public void run() {
				if (start != null) {
					start.play();
					while (!start.stopped())
						;
					try {
						Thread.sleep(418);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				loop.loop();
			}
		};
		player.start();
	}
	
	public void stop() {
		if (start != null)
			start.stop();
		loop.stop();
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
