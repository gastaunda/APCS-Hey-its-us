package mobs;
import javax.swing.ImageIcon;

import items.EntityList;
import items.GameObject;

public class Player extends Mob {
	private int atkCd = 50;
	private int currentCd = 0;
	public Player(int maxHealth, int health, GameObject[] inventory, double posX, double posY, double height, double width) {
		super(maxHealth, health, 1, inventory, posX, posY, height, width);
		super.myImage = new ImageIcon(EntityList.class.getResource("/assets/images/image.png"));
	}
	
	public GameObject[] invAccess(){
		return super.inv;
	}
	public void move(){
		super.move();
		currentCd--;
	}
	public void fire(){
		currentCd = atkCd;
	}
	public boolean canFire(){
		return currentCd <= 0;
	}
	public int maxHealth(){
		return maxHp;
	}

}
