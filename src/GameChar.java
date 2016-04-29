import Items.GameObject;

public class GameChar {
	private int maxHealth;
	private GameObject[] inventory;

	public GameChar(int h, GameObject[] inv){
    maxHealth = h;
    inventory = inv;
	}

	public GameObject[] die() {
		maxHealth = -1;
		return inventory;
	}
	
	public GameObject invAdd(GameObject floor){
		for(int a = 0; a < inventory.length; a++){
			if(inventory[a] == null){
				inventory[a] = floor;
				return floor;
			}
		}
		return null;
	}
}
