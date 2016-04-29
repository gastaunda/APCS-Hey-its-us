public class GameMob {

	int maxHealth;
	int health;
	GameObject[] dropinventory;

	public GameMob(int myHealth) {
		maxHealth = myHealth;
		health = maxHealth;
	}

	public void setDrops(GameObject[] objs) {
		dropinventory = objs;
	}

	public void addDrop(GameObject obj) {
		// dropinventory.add(obj)
	}

	public void takeDamage(int damage) {
		health -= damage;
		if (health <= 0)
		// kill (maybe use an interface to do so)
	}

}
