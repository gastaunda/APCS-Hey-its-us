package items;

import items.Wall;

public class Projectile implements GameEntity
{
	//private double gravity;
	//private int speed;
	private boolean bounce;
	private int durration;
	private GameObject obj;
	private int damage;
	private double velX;
	private double gravity;
	private double velY;
	
	public Projectile(double grav, double spd, boolean bounces, int bnce, int life,int fite, GameObject objt)
	{
		bounce = bounces;
		durration = life;
		obj = objt;
		damage = fite;
		velX = spd;
		gravity = grav;
		velY = 0;
	}

	@Override
	public void collide(GameEntity other) {
		other.takedamage(damage);
		
	}
	
	public void collide(Wall other){
		
	}
	
	public void collide(Floor other){
		setVelocityY(-velY);
	}

	@Override
	public void takedamage(int x) {
		
	}

	@Override
	public double getVelocityX() {
		// TODO Auto-generated method stub
		return velX;
	}

	@Override
	public double getVelocityY() {
		// TODO Auto-generated method stub
		return velY;
	}

	@Override
	public double getAccelerationX() {
		return 0;
	}

	@Override
	public double getAccelerationY() {
		// TODO Auto-generated method stub
		return gravity;
	}

	@Override
	public void setVelocityX(double velocity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVelocityY(double velocity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAccelerationX(double acceleration) {		
	}

	@Override
	public void setAccelerationY(double acceleration) {
		gravity = acceleration;
	}

	@Override
	public void accelerate() {
		velY -= gravity;
	}

	@Override
	public boolean bounce() {
		// TODO Auto-generated method stub
		return bounce;
	}
}
