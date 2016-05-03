package entities;

public class Entity {
	protected int hp;
	protected int maxHp;
	
	public Entity(int maxHealth, int health) {
		hp = health;
		maxHp = maxHealth;
	}
}
