package Mobs;

import Items.GameEntity;
import Items.GameObject;

public class Mob implements GameEntity 
{
	protected int hp;
	protected int maxHp;
	protected GameObject[] inv;//shouldn't this be a 2D array for multiple rows?
	protected int held;
	protected int atk;
	protected double xVel;
	protected double yVel;
	protected double maxXVel;
	protected double maxYVel;

	public Mob(int maxHealth, int health, int attack, GameObject[] inventory) 
	{
		maxHp = maxHealth;
		hp = health;
		inv = inventory;
		atk = attack;
		xVel = 0;
		yVel = 0;
	}

	public void takedamage(int damage) 
	{
		hp -= damage;
		if (hp <= 0) 
		{
			kill();
		}
	}

	public boolean heal(int amount) 
	{
		if (hp >= maxHp)
			return false;
		hp += amount;
		if (hp > maxHp)
			hp = maxHp;
		return true;
	}

	@Override
	public void collide(GameEntity other) 
	{
		other.takedamage(atk);

	}
	
	public void kill()
	{
		
	}
	
	public void addObj(GameObject obj)
	{
		//inv.add(obj)
	}
	
	public void setDropInv(GameObject[] inventory)
	{
		inv = inventory;
	}

	@Override
	public double getVelocityX() {
		// TODO Auto-generated method stub
		return xVel;
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
		
	}

}
