public class GameChar {
	private int maxHealth;
	private GameObject[] inventory;
	private boolean dropInv;

	public GameChar(int h, GameObject[] inv, boolean f){
    maxHealth = h;
    inventory = inv;
    dropInv = f;
  }

	public void die() {

	}

	public GameObject drop() {
		return null;
	}
}
