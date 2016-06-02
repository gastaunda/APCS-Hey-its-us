package items;

import javax.swing.ImageIcon;

public class Floor extends Wall {
	public Floor(double length, double xLoc, double yLoc) {
		super(length, xLoc, yLoc);
		super.myImage = new ImageIcon(Floor.class.getResource("/assets/images/Floor.png"));
	}
	public void collide(GameEntity other){
		double x = -((Math.random() * 2) + 2);
		other.setVelY(x);
		other.setAccY(0.05);
		other.setGround(true);
	}
}
