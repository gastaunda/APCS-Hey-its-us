package items;

import javax.swing.ImageIcon;

public class UpFloor extends Wall {

	public UpFloor(double length, double xLoc, double yLoc) {
		super(length, xLoc, yLoc);
		super.myImage = new ImageIcon(UpFloor.class.getResource("/assets/images/UpFloor.png"));
	}
	public void collide(GameEntity other){
		double x = Math.random() * 4;
		other.setVelY(x);
		other.setAccY(0.05);
		other.setGround(true);
	}
}
