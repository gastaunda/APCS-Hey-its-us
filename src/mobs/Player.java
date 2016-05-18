package mobs;
import javax.swing.ImageIcon;

import items.GameObject;

//don't we need protected GameObject[] hotbar;?  Or will the hotbar work off the inv?
//i.e. hotbar is first row of inventory? 

public class Player extends Mob {

	
	public Player(int maxHealth, int health, GameObject[] inventory, double posX, double posY, double height, double width,ImageIcon image) {
		super(maxHealth, health, 0, inventory, posX, posY, height, width,image);
		
	}
	
	public GameObject[] invAccess(){
		return super.inv;
	}
	
	public void jump()
	{
		setVelY(10);
		//jump method involving physics
		//Set Vy = -10;
		//As ticks get bigger, Vy changes with time (maybe +1 V value per tick for example)
	}
	

}
