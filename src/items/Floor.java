package items;


public class Floor extends Wall {
	public Floor(double length, double xLoc, double yLoc) {
		super(length, xLoc, yLoc);
	}
	public void collide(GameEntity other){
		double x = Math.random() * -4;
		other.setVelY(x);
		other.setAccY(0.05);
		other.setGround(true);
	}
}
