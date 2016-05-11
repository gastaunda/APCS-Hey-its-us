package mobs;
import items.GameObject;

//don't we need protected GameObject[] hotbar;?  Or will the hotbar work off the inv?
//i.e. hotbar is first row of inventory? 

public class Player extends Mob {

	public Player(int maxHealth, int health, GameObject[] inventory) {
		super(maxHealth, health, inventory);
		
	}
	
	
	public void jump()
	{
		//jump method involving physics
	}
	

}
