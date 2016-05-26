package GUIPractice;

import javax.swing.JFrame;

import aa.Game;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester {
	public static void main(String args[]) {
		startmusic();
		JFrame f = new JFrame();
		GraphicExperiment s = new GraphicExperiment();
		f.add(s);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		f.setExtendedState(Game.winState);
	}

	private static void startmusic() {
			if (Game.m != null)
				Game.m.close();
			Game.m = new aa.Music("assets/audio/music/If you don't know what to do just steal the amen break.ogg");
			Game.m.loop();
	}
}
