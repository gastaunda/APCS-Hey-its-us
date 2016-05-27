package items;

import javax.swing.ImageIcon;

import mobs.Player;

public class Pickup extends Wall {
	private int slot;
	public Pickup(double length, double xLoc, double yLoc, int s) {
		super(length, xLoc, yLoc);
		slot = s;
		if(slot == 0) // this one increases max health
			super.myImage = new ImageIcon(Pickup.class.getResource("/assets/images/hPickup.png"));
		else if(slot == 1) // this one increases attack
			super.myImage = new ImageIcon(Pickup.class.getResource("/assets/images/aPickup.png"));
		else if(slot == 2) // this one restores health
			super.myImage = new ImageIcon(Pickup.class.getResource("/assets/images/healthPickup.png"));
		else if(slot == 3){ // this one will reduce fire cd
			super.myImage = new ImageIcon(Pickup.class.getResource("/assets/images/cdPickup.png"));
		}
		
	}
	public void collide(GameEntity other){
		
	}
	public void collide(Player other){
		if(slot == 0)
			other.healthPickup();
		if(slot == 1)
			other.atkPickup();
		if(slot == 2)
			other.healPickup();
		if(slot == 3)
			other.cdPickup();
	}
}
