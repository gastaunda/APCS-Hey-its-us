package GUIPractice;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*; // access to Container
import java.awt.event.*; // access to WindowAdapter, WindowEvent
import javax.swing.*; // access to JFrame and JComponents
import javax.swing.event.*; // access 

import items.EntityList;
import items.Floor;
import items.GameObject;
import items.KillBlock;
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

	public GraphicExperiment() {
		for (double i = 0; i <= 100; i += 32) {
			lischt.add(new Floor(16, i, 200));
		}
		lischt.add(new Floor(12, 350, 245));
		for (double i = 350; i <= 1500; i += 32){
			lischt.add(new Floor(16, i, 500));
		}
		for (double i = 250; i <= 500; i += 64){
			lischt.add(new Wall(16, 350, i));
		}
		for (double i = 400; i <= 800; i += 50){
			lischt.add(new Mob(100, 100, 2, new GameObject[2], (double) i, (double) 200, (double) 16, (double) 16));
		}
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		lischt.player().getImage().paintIcon(this, g, (int) lischt.player().getPosX(), (int) lischt.player().getPosY());
		for (Wall x : lischt.getWalls()) {
			x.imageIcon().paintIcon(this, g, (int) x.getPosX(), (int) x.getPosY());
		}
		for (Projectile a : lischt.getProjectiles()) {
			a.imageIcon().paintIcon(this, g, (int) a.getPosX(), (int) a.getPosY());
		}
		for (Mob i : lischt.getMobs()) {
			i.imageIcon().paintIcon(this, g, (int) i.getPosX(), (int) i.getPosY());
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (lischt.kill()) { // get this to end game

		}
		lischt.frameAdvance();
		repaint();
	}

	public boolean canMove(double x, double y) {
		return true;
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP && lischt.player().getGround()) {
			lischt.player().setGround(false);
			lischt.player().setVelY(-10);
			lischt.player().move();

		}
		if (code == KeyEvent.VK_DOWN) // not really sure why you'd wanna do
										// this, but ok
		{
			lischt.player().setVelY(5);
		}

		if (code == KeyEvent.VK_RIGHT) {
			lischt.player().setAccX(0);
			lischt.player().setVelX(3);
		}

		if (code == KeyEvent.VK_LEFT) {
			lischt.player().setAccX(0);
			lischt.player().setVelX(-3);
		}
		if (code == KeyEvent.VK_Z)
			lischt.add(new Projectile(-3, 100, 1, lischt.player().getPosX() - 45, lischt.player().getPosY() + 15));

		if (code == KeyEvent.VK_X)
			lischt.add(new Projectile(3, 100, 1, lischt.player().getPosX() + 45, lischt.player().getPosY() + 15));
	}

	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_LEFT || code == KeyEvent.VK_RIGHT)
			lischt.player().setVelX(0);
		}

	public void keyTyped(KeyEvent e) {

	}

	
	
}
