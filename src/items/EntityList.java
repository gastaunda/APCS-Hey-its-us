package items;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import mobs.Mob;
import mobs.Player;

// this class may not be needed
public class EntityList {
	LinkedList<Projectile> projectiles;
	ArrayList<Wall> walls;
	ArrayList<Mob> mobs;
	LinkedList<FloorObject> floorDrops;
	Player player;

	public EntityList() {
		projectiles = new LinkedList<Projectile>();
		walls = new ArrayList<Wall>();
		mobs = new ArrayList<Mob>();
		floorDrops = new LinkedList<FloorObject>();
		player = new Player(10, 10, new GameObject[4], (double) 0, (double) 0, (double) 24, (double) 24,
				new ImageIcon("image.png")); // feel free to mess with these
		player.setAccY(.25);									// values
	}

	public void add(Projectile projfoj) {
		projectiles.add(projfoj);
	}

	public void add(Wall wallfall) {
		walls.add(wallfall);
	}

	public void add(Mob mobfob) {
		mobs.add(mobfob);
		mobfob.setAccY(3.62134);
	}

	public void add(FloorObject floorboor) {
		floorDrops.add(floorboor);
	}

	public LinkedList<Projectile> getProjectiles() {
		return projectiles;
	}
	
	public ArrayList<Wall> getWalls(){
		return walls;
	}

	public ArrayList<Mob> getMobs() {
		return mobs;
	}

	public LinkedList<FloorObject> getFloor() {
		return floorDrops;
	}

	public void frameAdvance() {
		for (int a = 0; a < walls.size(); a++) {
			for (Mob x : mobs) {
				if (walls.get(a).HitBox().collisionCheck(x.HitBox()))
					walls.get(a).collide(x);

			}
			for(Projectile p: projectiles){
				if((walls.get(a)).HitBox().collisionCheck(p.HitBox()))
					walls.get(a).collide(p);
			}
			if(walls.get(a).HitBox().collisionCheck(player.HitBox()))
					walls.get(a).collide(player);
		}
		for (Projectile a : projectiles) {
			for (Mob x : mobs) {
				if (a.HitBox().collisionCheck(x.HitBox()))
					a.collide(x);
			}
			if (a.HitBox().collisionCheck(player.HitBox()))
				a.collide(player);
			a.move();
		}
		for (Mob x : mobs) {
			if (x.HitBox().collisionCheck(player.HitBox()))
				x.collide(player);
			x.move();
		}
		player.move();

	}

	public Player player() {
		return player;
	}

	public boolean kill() { // ends game (player is dead)
		return player.getHealth() <= 0;
	}
}
