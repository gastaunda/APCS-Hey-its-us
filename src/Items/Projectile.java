package Items;

public class Projectile implements GameEntity
{
	//private double gravity;
	//private int speed;
	private boolean bounce;
	private int durration;
	private GameObject obj;
	
	public Projectile(double grav, int spd,boolean bounces, int bnce, int life, GameObject objt)
	{
		Physics(grav, spd);
		bounce = bounces;
		durration = life;
		obj = objt;
	}

	@Override
	public void collide(GameEntity other) {
		// TODO Auto-generated method stub
		
	}
}
