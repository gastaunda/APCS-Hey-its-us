package oggVorbis;

import java.io.IOException;

public class Music {
	private OggClip clip;

	public Music(String start, String loop, String ending) {
		try {
			clip = new OggClip(start, loop, ending);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Music(String start, String loop) {
		this(start, loop, null);
	}

	public Music(String loop) {
		this(null, loop);
	}

	public Music() {
		this("assets/audio/music/Local Forecast - Elevator.ogg");
	}

	public void play() {
		clip.play();
	}

	public void loop() {
		clip.loop();
	}

	public void end() {
		clip.end();
	}

	public void stop() {
		clip.stop();
	}

	public void close() {
		stop();
		clip.close();
	}

	public void pause() {
		clip.pause();
	}

	public void unpause() {
		clip.resume();
	}

	public boolean isPaused() {
		return clip.isPaused();
	}

	public boolean stopped() {
		return clip.stopped();
	}
}
