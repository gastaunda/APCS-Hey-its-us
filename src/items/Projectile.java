package items;

import items.Wall;

public class Projectile extends GameEntity
{
	//private double gravity;
	//private int speed;
	private int durration;
	private GameObject obj;
	private int damage;
	Projectile(double grav, double spd, float bounces, int bnce, int life,int fite, GameObject objt, double posX, double posY, double radius)
	{
		durration = life;
		obj = objt;
		damage = fite;
		setVelX(spd);
		setVelY(0);
		setHitBox(posX, posY, radius, radius);
	}

	public void collide(GameEntity other) {
		other.takedamage(damage);
		
	}
	public void collide(Floor other){
		setVelY(0 - getVelY());
	}
	public void move(){
		super.move();
		durration--;
	}
	public int remainingLife(){
		return durration;
	}
}
