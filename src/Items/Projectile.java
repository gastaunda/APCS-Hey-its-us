package Items;

public class Projectile implements GameEntity
{
	//private double gravity;
	//private int speed;
	private boolean bounce;
	private int durration;
	private GameObject obj;
	private int damage;
	
	public Projectile(double grav, int spd, boolean bounces, int bnce, int life,int fite, GameObject objt)
	{
		Physics(grav, spd);
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
}
