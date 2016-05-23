package items;

import javax.swing.ImageIcon;

import items.Wall;

public class Projectile extends GameEntity
{
	//private double gravity;
	//private int speed;
	private int durration;
	private int damage;
	public Projectile(double grav, double spd, int life,int fite, double posX, double posY)
	{
		durration = life;
		damage = fite;
		setPosX(posX);
		setPosX(posY);
		setVelX(spd);
		setVelY(0);
		setHitBox(posX, posY, 10,10);
		super.myImage = new ImageIcon("boolet.png");
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
