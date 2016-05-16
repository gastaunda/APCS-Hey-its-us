package items;

public abstract class GameEntity {
	private double posX;
	private double posY;
	private double velX;
	private double velY;
	private double accX;
	private double accY;
	private double vXMax;
	private double vYMax;
	private int health;
	private float bounce;
	public abstract void collide(GameEntity other);
	
	public void takedamage(int x) {
		health -= x;
	}
	
	public int getHealth(){
		return health;
	}
	
	public double getVelocityX() {
		return velX;
	}
	
	public double getVelocityY() {
		return velY;
	}
	
	public double getAccelerationX() {
		return accX;
	}
	
	public double getAccelerationY() {
		return accY;
	}
	
	public void setVelocityX(double velocity) {
		velX = velocity;
	}
	
	public void setVelocityY(double velocity) {
		velY = velocity;
	}
	
	public void setAccelerationX(double acceleration) {
		accX = acceleration;
	}
	
	public void setAccelerationY(double acceleration) {
		accY = acceleration;
	}
	
	private float bounce(){
		return bounce;
	}
	
	public void move() {
		posX += velX;
		posY += velY;
		velX += accX;
		velY += accY;
		if (velX > vXMax)
			velX = vXMax;
		if (velY > vYMax)
			velY = vYMax;
		
	}
}
