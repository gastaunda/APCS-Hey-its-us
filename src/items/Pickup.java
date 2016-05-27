package items;

import javax.swing.ImageIcon;

import mobs.Player;

public class Pickup extends Wall {
	private int slot;
	private int value;
	public Pickup(double length, double xLoc, double yLoc, int s, int v) {
		super(length, xLoc, yLoc);
		super.myImage = new ImageIcon(Wall.class.getResource("/assets/images/Brick.png"));
		slot = s;
		value = v;
	}
	public void collide(Player other){
		other.invAccess()[slot] = value;
	}
}
