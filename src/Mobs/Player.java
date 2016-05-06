package Mobs;

import Items.GameObject;

public class Player extends Mob {

	public Player(int maxHealth, int health, int atk, GameObject[] inventory) {
		super(maxHealth, health, atk, inventory);
	}

	public boolean invAdd(GameObject item, int index) {
		if (index >= 0 && index < inv.length && inv[index] == null) {
			inv[index] = item;
			return true;
		}
		return false;
	}

	public GameObject invRemove(int index) {
		if (index >= 0 && index < inv.length) {
			GameObject remo = inv[index];
			inv[index] = null;
			return remo;
		}
		return null;
	}

}
