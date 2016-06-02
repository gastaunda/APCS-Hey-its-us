package GUIPractice;

import javax.swing.JFrame;

import mobs.Player;
import aa.DeathMenu;
import aa.Game;
import aa.Win;
import items.EntityList;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tester {
	public static void init(int i) {
		startmusic();
		JFrame f = new JFrame();
		GraphicExperiment s = new GraphicExperiment(i);
		f.add(s);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(Game.winX, Game.winY, Game.winWidth, Game.winHeight);
		f.setExtendedState(Game.winState);
		f.setTitle(Game.name);
		new Thread() {
			public void run() {
				while (true) {
					try { // allows stuff to werk
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (s.kill()) {
						DeathMenu.dMenu();
						f.dispose();
						break;
					} else if (s.victory()) {
						Win.winMenu();
						f.dispose();
						break;
					}
				}
			}
		}.start();
	}

	private static void startmusic() {
		if (Game.m != null)
			Game.m.close();
		Game.m = new oggVorbis.Music("assets/audio/music/If you don't know what to do just steal the amen break 1.ogg",
				"assets/audio/music/If you don't know what to do just steal the amen break 2.ogg",
				"assets/audio/music/If you don't know what to do just steal the amen break 3.ogg");
		Game.m.loop();

	}

	public void death(JFrame f, GraphicExperiment s) {
		s.death(f);
	}
}
