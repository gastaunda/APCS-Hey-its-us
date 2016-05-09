


public class Physics {
	private double vX;
	private double vY;
	private double maxvX;
	private double maxvY;
	private double aX;
	private double aY;
	
	
	public Physics (double velocityX, double velocityY, double maxvelX, double maxvelY, double accelerationX, double accelerationY) {
		vX = velocityX;
		vY = velocityY;
		maxvX = maxvelX;
		maxvY = maxvelY;
		aX = accelerationX;
		aY = accelerationY;
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
		vY = velocity;
	}
	
	public void setAccelerationX(double acceleration) {
		aX = acceleration;
	}
	
	public void setAccelerationY(double acceleration) {
		aY = acceleration;
	}
	
	public void accelerate() {
		vX = aX;
		vY = aY;
	}
	
}
