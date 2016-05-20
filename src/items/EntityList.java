package items;

import java.util.ArrayList;
import java.util.LinkedList;

import mobs.Mob;
import mobs.Player;
// this class may not be needed
public class EntityList {
	LinkedList<Projectile> projectiles;
	ArrayList<Mob> mobs;
	LinkedList<FloorObject> floorDrops;
	Player player;
	
	public EntityList(){
		projectiles = new LinkedList<Projectile>();
		mobs = new ArrayList<Mob>();
		floorDrops = new LinkedList<FloorObject>();
		player = new Player(10, 10, new GameObject[4], (double) 0, (double) 0, (double)5, (double)2, null); // feel free to mess with these values
	}
	
	public LinkedList<Projectile> getProjectiles(){
		return projectiles;
	}
	
	public ArrayList<Mob> getMobs(){
		return mobs;
	}
	
	public LinkedList<FloorObject> getFloor(){
		return floorDrops;
	}
	
	public void frameAdvance(){
		for(Projectile a: projectiles){
			for(Mob x: mobs){
				if(a.HitBox().collisionCheck(x.HitBox()))
					a.collide(x);				
			}
			if(a.HitBox().collisionCheck(player.HitBox()))
				a.collide(player);
		}
		for(Mob x: mobs){
			if(x.HitBox().collisionCheck(player.HitBox()))
				x.collide(player);
		}
	}
	
	public void kill(){ // ends game (player is dead)
		
	}
}
