package items;

import javax.swing.ImageIcon;

import mobs.Player;

public class Pickup extends Wall {
	private int slot;
	public Pickup(double length, double xLoc, double yLoc, int s, int v) {
		super(length, xLoc, yLoc);
		super.myImage = new ImageIcon(Pickup.class.getResource("/assets/images/Brick.png"));
		slot = s;
	}
	public void collide(Player other){
		if(slot == 0)
			other.healthPickup();
		if(slot == 1)
			other.atkPickup();
	}
}
