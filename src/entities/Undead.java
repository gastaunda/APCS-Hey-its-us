package entities;
import Items.GameObject;

public class Undead extends Mob {

	public Undead(int maxHealth, int health, GameObject[] inventory) {
		super(maxHealth, health, inventory);
	}
	
	public void magHeal(int amount) {
		takedamage(amount);
	}
	
	public void magDamage(int damage) {
		heal(damage);
	}
}
