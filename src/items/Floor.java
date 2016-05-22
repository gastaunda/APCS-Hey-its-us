package items;

public class Floor extends Wall {
	public Floor(double length, double xLoc, double yLoc) {
		super(length, xLoc, yLoc);
	}
	public void collide(GameEntity other){
		other.setVelY(0);
		other.setGround(true);
	}
}
