package items;

import javax.swing.ImageIcon;

public class KillBlock extends Wall{
	public KillBlock(double length, double xLoc, double yLoc){
		super(length, xLoc, yLoc);
		myImage = new ImageIcon("KillBrick.png");
	}
	public void collide(GameEntity other){
			other.takedamage(999);
	}
}
