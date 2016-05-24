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
	Mob mob;

	public EntityList() {
		projectiles = new LinkedList<Projectile>();
		walls = new ArrayList<Wall>();
		mobs = new ArrayList<Mob>();
		floorDrops = new LinkedList<FloorObject>();
		player = new Player(1000, 1000, new GameObject[4], (double) 0, (double) 0, (double) 24, (double) 24,
				new ImageIcon(EntityList.class.getResource("/assets/images/image.png"))); // feel free to mess with these
		mobs.add(new Mob(100, 100, 20, new GameObject[2], (double) 100, (double) 100, (double) 20, (double) 20, 
				new ImageIcon(EntityList.class.getResource("/assets/images/Boolet.png"))));
		mobs.add(new Mob(100, 100, 20, new GameObject[2], (double) 400, (double) 450, (double) 20, (double) 20, 
				new ImageIcon(EntityList.class.getResource("/assets/images/Boolet.png"))));
		mobs.add(new Mob(100, 100, 20, new GameObject[2], (double) 550, (double) 475, (double) 20, (double) 20, 
				new ImageIcon(EntityList.class.getResource("/assets/images/Boolet.png"))));
		player.setAccY(.2);				// values
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
		for (int a = 0; a < projectiles.size(); a++) {
			for (int x = 0; x < mobs.size(); x++) {
				if (projectiles.get(a).HitBox().collisionCheck(mobs.get(x).HitBox()))
					projectiles.get(a).collide(mobs.get(x));
			}
			if (projectiles.get(a).HitBox().collisionCheck(player.HitBox()))
				projectiles.get(a).collide(player);
			projectiles.get(a).move();
			if(projectiles.get(a).remainingLife() <= 0){
				projectiles.remove(a);
				a--;
			}
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

	public boolean kill() { // ends game if troo(player is dead)
		return player.getHealth() <= 0;
	}
}
