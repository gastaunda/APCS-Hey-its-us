package Mobs;

import Items.GameObject;

//don't we need protected GameObject[] hotbar;?  Or will the hotbar work off the inv?
//i.e. hotbar is first row of inventory? 

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
