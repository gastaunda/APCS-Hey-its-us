package entities;
import Items.GameObject;

public class Mob extends Entity {

	protected GameObject[] inv;
	protected int held;

	public Mob(int maxHealth, int health, GameObject[] inventory) {
		super(maxHealth, health);
		inv = inventory;
		held = 0;
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
	
	public void magHeal(int amount) {
		heal(amount);
	}
	
	public void magDamage(int damage) {
		takedamage(damage);
	}
}
