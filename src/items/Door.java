package items;

import javax.swing.ImageIcon;

public class Door extends Wall {
	public Door(double length, double xLoc, double yLoc){
		super(length, xLoc, yLoc);
		myImage = new ImageIcon(Door.class.getResource("/assets/images/Door.png"));
	}
	public void collide(GameEntity other){
		other.setVictory(true);
	}
}
