package mobs;

import javax.swing.ImageIcon;

import items.EntityList;
import items.GameEntity;

public class Mob extends GameEntity {
	protected int hp;
	protected int maxHp;// shouldn't this be a 2D array for multiple
								// rows?
	protected int held;			// no.
	protected int atk;
	protected double myHeight;
	protected double myWidth;
	
	public Mob(int maxHealth, int health, int attack, double posX, double posY, double height, double width) 
	{
		myHeight = height;
		myWidth = width;
		myImage = new ImageIcon(EntityList.class.getResource("/assets/images/mob.png"));
		maxHp = maxHealth;
		hp = health;
		atk = attack;
		setPosX(posX);
		setPosY(posY);
		setVelX(0);
		setVelY(2);
		setAccX(0);
		setAccY(0);
		setHitBox(posX, posY, height, width);
	}

	public void takedamage(int damage) {
		hp -= damage;
	}

	public boolean heal(int amount) {
		if (hp >= maxHp)
			return false;
		hp += amount;
		if (hp > maxHp)
			hp = maxHp;
		return true;
	}

	@Override
	public void collide(GameEntity other) {
		other.takedamage(atk);
		other.setVelX(-other.getVelX() * 1);
		other.setVelY(-other.getVelY() * 1);
	}
	
	public ImageIcon getImage()
	{
		return myImage;
	}

	public double getHeight()
	{
		return myHeight;
	}
	
	public double getWidth()
	{
		return myWidth;
	}
	
	public void MoveLeft()
	{
		setVelX(-1);
		move();
	}

	public void MoveRight()
	{
		setVelX(4);
		move();
	}
	
	
	public int getHealth(){
		return hp;
	}
	
	public void MoveDown()
	{
		setVelY(-1);
		move();
	}
}
