package items;

import java.util.ArrayList;
import java.util.LinkedList;

import mobs.Mob;

public class EntityList {
	LinkedList<Projectile> projectiles;
	ArrayList<Mob> mobs;
	
	public EntityList(){
		projectiles = new LinkedList<Projectile>();
		mobs = new ArrayList<Mob>();
	}
	
	public LinkedList<Projectile> getProjectiles(){
		return projectiles;
	}
	
	public ArrayList<Mob> getMobs(){
		return mobs;
	}
}
