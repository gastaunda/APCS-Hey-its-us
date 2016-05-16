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
}
