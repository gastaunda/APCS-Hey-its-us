package Mobs;
import Items.GameObject;

public class Undead extends Mob {

	public Undead(int maxHealth, int health, int atk, GameObject[] inventory) {
		super(maxHealth, health, atk, inventory);
	}
	
	public boolean heal(int amount) {
		super.takedamage(amount);
		return false;
	}
}
