package mobs;
import javax.swing.ImageIcon;


import items.GameObject;

public class Player extends Mob {

	
	public Player(int maxHealth, int health, GameObject[] inventory, double posX, double posY, double height, double width,ImageIcon image) {

		super(maxHealth, health, 0, inventory, posX, posY, height, width,image);
		
	}
	
	public GameObject[] invAccess(){
		return super.inv;
	}
}
