package mobs;

public class Undead extends Mob {

	public Undead(int maxHealth, int health, int atk, double posX, double posY, double height, double width) {
		super(maxHealth, health, atk, posX, posY, height, width);
	}
	
	public boolean heal(int amount) {
		super.takedamage(amount);
		return false;
	}
}
