package mobs;
import javax.swing.ImageIcon;

import items.EntityList;

public class Player extends Mob {
	private int atkCd = 50;
	private int currentCd = 0;
	public Player(int maxHealth, int health, double posX, double posY, double height, double width) {
		super(maxHealth, health, 1, posX, posY, height, width);
		super.myImage = new ImageIcon(EntityList.class.getResource("/assets/images/image.png"));
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
		return super.maxHp;
	}
	public void healthPickup(){
		
		super.maxHp++;
		super.heal(1);
	}
	public void atkPickup(){
		atk++;
	}
	public void healPickup(){
		super.heal(2);
	}
	public void cdPickup(){
		atkCd -=5;
	}
	public int atk(){
		return super.atk;
	}
	
	public boolean alive(){
		if(super.health <= 0)
			return false;
		else
			return true;
	}
	public int fireSpeed(){
		return (55 - atkCd) / 5;
	}
}
