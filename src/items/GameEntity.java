package items;

public interface GameEntity {
	public void collide(GameEntity other);
	
	public void takedamage(int x);
	
	public double getVelocityX();
	
	public double getVelocityY();
	
	public double getAccelerationX();
	
	public double getAccelerationY();
	
	public void setVelocityX(double velocity);
	
	public void setVelocityY(double velocity);
	
	public void setAccelerationX(double acceleration);
	
	public void setAccelerationY(double acceleration);
	
	public void accelerate();
}
