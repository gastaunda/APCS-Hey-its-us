package items;

import items.Wall;

public class Projectile extends GameEntity
{
	//private double gravity;
	//private int speed;
	private int durration;
	private GameObject obj;
	private int damage;
	Projectile(double grav, double spd, float bounces, int bnce, int life,int fite, GameObject objt)
	{
		durration = life;
		obj = objt;
		damage = fite;
		super.setVelX(spd);
		super.setVelY(0);
		super
	}

	public void collide(GameEntity other) {
		other.takedamage(damage);
		
	}
	
	public void collide(Wall other){
		
	}
	
	public void collide(Floor other){
		setVelocityY(-velY);
	}
}
