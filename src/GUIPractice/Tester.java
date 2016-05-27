package GUIPractice;

import javax.swing.JFrame;

import mobs.Player;
import aa.DeathMenu;
import aa.Game;
import items.EntityList;

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
		GraphicExperiment s = new GraphicExperiment(1);
		f.add(s);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		f.setExtendedState(Game.winState);
		f.setTitle(Game.name);
	}

	private static void startmusic() {
		if (Game.m != null)
			Game.m.close();
		Game.m = new aa.Music("assets/audio/music/If you don't know what to do.ogg",
				"assets/audio/music/just steal the amen break.ogg");
			Game.m.loop();
		
	}

	public static void close(JFrame f){
		DeathMenu.main(null);
		f.dispose();
	}
}
