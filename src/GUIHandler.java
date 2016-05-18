
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.*; // access to Container
import java.awt.event.*; // access to WindowAdapter, WindowEvent

import javax.swing.*; // access to JFrame and JComponents
import javax.swing.event.*;
import mobs.Player;

// access 
/**
 * Write a description of class Graphics here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUIHandler extends JPanel implements ActionListener, KeyListener {
	Timer t = new Timer(5, this);

	Player player;

	double x = 0, y = 0, velx = 0, vely = 0;

	public GUIHandler(Player play) {
		player = play;
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		player.getImage().paintIcon(this, g, (int) x, (int) y);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		x += velx;
		y += vely;
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			player.jump();

		}
		if (code == KeyEvent.VK_DOWN) {
			player.MoveDown();
		}
		if (code == KeyEvent.VK_RIGHT) {
			player.MoveRight();
		} else if (player.getVelX() > 0) {
			player.setVelX(player.getVelX() - .1);
		}
		if (code == KeyEvent.VK_LEFT) {
			player.MoveLeft();
		} else if (player.getVelX() < 0) {
			player.setVelX(player.getVelX() + .1);
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}
}