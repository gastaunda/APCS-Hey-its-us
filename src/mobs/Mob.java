package mobs;

import items.GameEntity;
import items.GameObject;

public class Mob extends GameEntity {
	protected int hp;
	protected int maxHp;
	protected GameObject[] inv;// shouldn't this be a 2D array for multiple
								// rows?
	protected int held;			// no.
	protected int atk;

	public Mob(int maxHealth, int health, int attack, GameObject[] inventory, double posX, double posY, double height, double width) {
		maxHp = maxHealth;
		hp = health;
		inv = inventory;
		atk = attack;
		setPosX(posX);
		setPosY(posY);
		setVelX(0);
		setVelY(0);
		setAccX(0);
		setAccY(0);
		setHitBox(posX, posY, height, width);
	}

	public void takedamage(int damage) {
		hp -= damage;
		if (hp <= 0) {
			kill();
		}
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

	}

	public void kill() {

	}

	public void addObj(GameObject obj) {
		// inv.add(obj)
	}

	public void setDropInv(GameObject[] inventory) {
		inv = inventory;
	}
}
