package GUIPractice;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.*; // access to Container
import java.awt.event.*; // access to WindowAdapter, WindowEvent

import javax.swing.*; // access to JFrame and JComponents
import javax.swing.event.*; // access 

import com.jgoodies.forms.factories.DefaultComponentFactory;

import aa.DeathMenu;
import aa.GameMenu;
import items.Door;
import items.EntityList;
import items.Floor;
import items.KillBlock;
import items.Pickup;
import items.Projectile;
import items.Wall;
import mobs.Mob;

import java.util.ArrayList;

/**
 * Write a description of class Graphics here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class GraphicExperiment extends JPanel implements ActionListener, KeyListener {
	private EntityList lischt = new EntityList();
	Timer t = new Timer(5, this);
	ImageIcon background;
	ImageIcon heart;
	ImageIcon redHeart;
	ImageIcon sword;
	ImageIcon cd;
	private boolean up;
	private boolean down;
	private boolean left;
	private boolean right;
	private boolean sUp;
	private boolean sDown;
	private boolean sLeft;
	private boolean sRight;

	public GraphicExperiment(int k) {
		background = new ImageIcon(GraphicExperiment.class.getResource("/assets/images/Background.png"));
		heart = new ImageIcon(GraphicExperiment.class.getResource("/assets/images/Heart.png"));
		redHeart = new ImageIcon(GraphicExperiment.class.getResource("/assets/images/curHeart.png"));
		sword = new ImageIcon(GraphicExperiment.class.getResource("/assets/images/atk.png"));
		cd = new ImageIcon(GraphicExperiment.class.getResource("/assets/images/Clock.png"));
		LevelBuild.buildLevel(k, lischt);
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		background.paintIcon(this, g, 0, 0);
		for (int i = 0; i < lischt.player().maxHealth(); i++) {
			heart.paintIcon(this, g, i * 32, 0);
		}
		for (int i = 0; i < lischt.player().getHealth(); i++) {
			redHeart.paintIcon(this, g, i * 32, 0);
		}
		for (int i = 0; i < lischt.player().atk(); i++) {
			sword.paintIcon(this, g, i * 32, 32);
		}
		for (int i = 0; i < lischt.player().fireSpeed(); i++) {
			cd.paintIcon(this, g, i * 32, 64);
		}
		lischt.player().getImage().paintIcon(this, g, (int) lischt.player().getPosX(), (int) lischt.player().getPosY());
		for (Pickup a : lischt.getFloor()) {
			a.imageIcon().paintIcon(this, g, (int) a.getPosX(), (int) a.getPosY());
		}
		for (Wall x : lischt.getWalls()) {
			x.imageIcon().paintIcon(this, g, (int) x.getPosX(), (int) x.getPosY());
		}
		for (Projectile a : lischt.getProjectiles()) {
			a.imageIcon().paintIcon(this, g, (int) a.getPosX(), (int) a.getPosY());
		}
		for (Mob i : lischt.getMobs()) {
			i.imageIcon().paintIcon(this, g, (int) i.getPosX(), (int) i.getPosY());
		}
		JLabel lblscore = DefaultComponentFactory.getInstance().createTitle("Score: " + Integer.toString(lischt.score()));
		lblscore.setHorizontalAlignment(SwingConstants.RIGHT);
		lblscore.setBounds(0, GameMenu.btnSpace, frame.getWidth(), 20);
		lblscore.setForeground(new Color(255, 0, 51));
		lblscore.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblscore);
	}

	public void actionPerformed(ActionEvent e) { // move this to ingame display
													// l8er?
		lischt.frameAdvance();
		processIn();
		repaint();
	}

	public boolean canMove(double x, double y) {
		return true;
	}

	public boolean kill() {
		return lischt.kill();
	}

	public boolean victory() {
		return lischt.player().victorious();
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP)
			up = true;

		if (code == KeyEvent.VK_DOWN) // not really sure why you'd wanna do
										// this, but ok
			down = true;

		if (code == KeyEvent.VK_RIGHT)
			right = true;

		if (code == KeyEvent.VK_LEFT)
			left = true;

		if (code == KeyEvent.VK_Z)
			sLeft = true;

		if (code == KeyEvent.VK_C)
			sRight = true;

		if (code == KeyEvent.VK_S)
			sUp = true;

		if (code == KeyEvent.VK_X)
			sDown = true;
	}

	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP)
			up = false;

		if (code == KeyEvent.VK_DOWN) // not really sure why you'd wanna do
										// this, but ok
			down = false;

		if (code == KeyEvent.VK_RIGHT)
			right = false;

		if (code == KeyEvent.VK_LEFT)
			left = false;

		if (code == KeyEvent.VK_Z)
			sLeft = false;

		if (code == KeyEvent.VK_C)
			sRight = false;

		if (code == KeyEvent.VK_S)
			sUp = false;

		if (code == KeyEvent.VK_X)
			sDown = false;
	}

	public void keyTyped(KeyEvent e) {

	}

	private void processIn() {
		if (up && lischt.player().getGround()) {
			lischt.player().setGround(false);
			lischt.player().setVelY(-10);
			lischt.player().move();
		}

		if (down)
			lischt.player().setVelY(5);

		if (left == right)
			lischt.player().setVelX(0);
		else {
			if (right) {
				lischt.player().setAccX(0);
				lischt.player().setVelX(3);
			}

			if (left) {
				lischt.player().setAccX(0);
				lischt.player().setVelX(-3);
			}
		}

		if (sLeft && lischt.player().canFire()) {
			lischt.add(new Projectile(-5, 0, 100, lischt.player().atk(), lischt.player().getPosX() - 17,
					lischt.player().getPosY() + 8));
			lischt.player().fire();
		}

		if (sRight && lischt.player().canFire()) {
			lischt.add(new Projectile(5, 0, 100, lischt.player().atk(), lischt.player().getPosX() + 33,
					lischt.player().getPosY() + 8));
			lischt.player().fire();
		}

		if (sUp && lischt.player().canFire()) {
			lischt.add(new Projectile(0, -5, 100, lischt.player().atk(), lischt.player().getPosX() + 8,
					lischt.player().getPosY() - 17));
			lischt.player().fire();
		}

		if (sDown && lischt.player().canFire()) {
			lischt.add(new Projectile(0, 5, 100, lischt.player().atk(), lischt.player().getPosX() + 8,
					lischt.player().getPosY() + 33));
			lischt.player().fire();
		}
	}

	public void death(JFrame f) {
		while (true) {
			if (lischt.player().getHealth() <= 0) {
				DeathMenu.dMenu();
				f.dispose();
			}
		}
	}

}
