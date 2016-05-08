import java.io.IOException;

import org.newdawn.easyogg.OggClip;

public class Game {
	private OggClip music;

	public static void main(String[] args) {
		Game game = new Game("assets\\music\\There is no game.ogg");
		while (!game.music.stopped())
			;
	}

	public Game(String path) {
		try {
			music = new OggClip(path);
			music.play();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
