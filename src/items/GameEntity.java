package items;

public abstract class GameEntity {
	private double x;
	private double y;
	private double vX;
	private double vY;
	private double aX;
	private double aY;
	private double vXMax;
	private double vYMax;
	private int health;

	public abstract void collide(GameEntity other);
	
	public void takedamage(int x) {
		health -= x;
	}
	
	public double getVelocityX() {
		return vX;
	}
	
	public double getVelocityY() {
		return vY;
	}
	
	public double getAccelerationX() {
		return aX;
	}
	
	public double getAccelerationY() {
		return aY;
	}
	
	public void setVelocityX(double velocity) {
		vX = velocity;
	}
	
	public void setVelocityY(double velocity) {
		aX = velocity;
	}
	
	public void setAccelerationX(double acceleration) {
		aX = acceleration;
	}
	
	public void setAccelerationY(double acceleration) {
		aY = acceleration;
	}
	
	public void move() {
		vX += aX;
		vY += aY;
		if (vX > vXMax)
			vX = vXMax;
		if (vY > vYMax)
			vY = vYMax;
		x += vX;
		y += vY;
	}
}
