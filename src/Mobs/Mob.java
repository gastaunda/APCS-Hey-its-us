package Mobs;

import Items.GameEntity;
import Items.GameObject;

public class Mob implements GameEntity 
{
	protected int hp;
	protected int maxHp;
	protected GameObject[] inv;
	protected int held;

	public Mob(int maxHealth, int health, GameObject[] inventory) 
	{
		maxHp = maxHealth;
		hp = health;
		inv = inventory;
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

	public void magHeal(int amount) 
	{
		heal(amount);
	}

	public void magDamage(int damage) 
	{
		takedamage(damage);
	}

	@Override
	public void collide(GameEntity other) 
	{
		// TODO Auto-generated method stub

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

}
