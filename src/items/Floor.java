package items;

public class Floor extends Wall {
	public Floor(double length, double xLoc, double yLoc) {
		super(xLoc, yLoc, length);
		setHitBox(xLoc, yLoc, 5, length);
	}

}
