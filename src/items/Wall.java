package items;

import javax.swing.ImageIcon;

public class Wall extends GameEntity{
	public Wall(double length, double xLoc, double yLoc){
		setHitBox(xLoc, yLoc, length, length);
		myImage = new ImageIcon(Wall.class.getResource("/assets/images/Wall.png"));
		setPosX(xLoc);
		setPosY(yLoc);
	}
	@Override
	public void collide(GameEntity other) {
		other.setVelX(-other.getVelX());
		other.setGround(true);
	}
}
