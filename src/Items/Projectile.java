package Items;
public class Projectile implements GameEntity
{
	//private double gravity;
	//private int speed;
	private boolean bounce;
	private int durration;
	private GameObject obj;
	private int damage;
	
	public Projectile(double grav, double spd, boolean bounces, int bnce, int life,int fite, GameObject objt)
	{
		bounce = bounces;
		durration = life;
		obj = objt;
		damage = fite;
	}

	@Override
	public void collide(GameEntity other) {
		other.takedamage(damage);
		
	}

	@Override
	public void takedamage(int x) {
		
	}

	@Override
	public double getVelocityX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getVelocityY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAccelerationX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAccelerationY() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAccelerationY(double acceleration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
}
