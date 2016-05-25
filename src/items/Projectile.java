package items;

import javax.swing.ImageIcon;

import items.Wall;

public class Projectile extends GameEntity
{
	//private double gravity;
	//private int speed;
	private int durration;
	private int damage;
	public Projectile(double spd, int life,int fite, double posX, double posY)
	{
		durration = life;
		damage = fite;
		setPosX(posX);
		setPosY(posY);
		setVelX(spd);
		setVelY(0);
		setHitBox(posX, posY, 10,10);
		super.myImage = new ImageIcon(Projectile.class.getResource("/assets/images/Boolet.png"));
		setMaxVel(10);
	}

	public void collide(GameEntity other) {
		other.takedamage(damage);
		
	}
	public void move(){
		super.move();
		durration--;
	}
	public int remainingLife(){
		return durration;
	}
}
