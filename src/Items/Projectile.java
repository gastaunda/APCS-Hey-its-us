package Items;

public class Projectile 
{
	//private double gravity;
	//private int speed;
	private boolean bounce;
	private int durration;
	private GameObject obj;
	
	public Projectile(double grav, int spd,boolean bounces, int bnce, int life, GameObject objt)
	{
		Physics(grav, spd)
		bounce = bounces;
		durration = life;
		obj = objt;
	}
}
