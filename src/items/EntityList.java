package items;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import GUIPractice.Tester;
import mobs.Mob;
import mobs.Player;

// this is basically the game's engine
public class EntityList {
	private LinkedList<Projectile> projectiles;
	private ArrayList<Wall> walls;
	private ArrayList<Mob> mobs;
	private LinkedList<Pickup> floorDrops;
	private Player player;
	private int score;
	
	public EntityList() {
		projectiles = new LinkedList<Projectile>();
		walls = new ArrayList<Wall>();
		mobs = new ArrayList<Mob>();
		floorDrops = new LinkedList<Pickup>();
		player = new Player(10, 10, (double) 0, (double) 0, (double) 16, (double) 16); // feel free to change these
		score = 0;
		player.setAccY(.075);
	}
	public int score(){
		return score;
	}
	public void add(Projectile projfoj) {
		projectiles.add(projfoj);
	}

	public void add(Wall wallfall) {
		walls.add(wallfall);
	}

	public void add(Mob mobfob) {
		mobs.add(mobfob);
		mobfob.setAccY(.075);
	}

	public void add(Pickup floorboor) {
		floorDrops.add(floorboor);
	}

	public LinkedList<Projectile> getProjectiles() {
		return projectiles;
	}

	public ArrayList<Wall> getWalls() {
		return walls;
	}

	public ArrayList<Mob> getMobs() {
		return mobs;
	}

	public LinkedList<Pickup> getFloor() {
		return floorDrops;
	}

	public void frameAdvance() {
		for (int a = 0; a < walls.size(); a++) {
			for (Mob x : mobs) {
				if (walls.get(a).HitBox().collisionCheck(x.HitBox()))
					walls.get(a).collide(x);

			}
			for (Projectile p : projectiles) {
				if ((walls.get(a)).HitBox().collisionCheck(p.HitBox()))
					walls.get(a).collide(p);
			}
			if (walls.get(a).HitBox().collisionCheck(player.HitBox())){
				walls.get(a).collide(player);
			}
		}
		for (int a = 0; a < projectiles.size(); a++) {
			for (int x = 0; x < mobs.size(); x++) {
				if (mobs.get(x).HitBox().collisionCheck(projectiles.get(a).HitBox())){
					projectiles.get(a).collide(mobs.get(x));
					score++;
					projectiles.get(a).remove();
				}
			}
			if (player.HitBox().collisionCheck(projectiles.get(a).HitBox())){
				projectiles.get(a).collide(player);
				projectiles.get(a).remove();
			}
			projectiles.get(a).move();
			if (projectiles.get(a).remainingLife() <= 0) {
				projectiles.remove(a);
				a--;
			}
		}
		for (int x = 0; x < mobs.size(); x++) {

			if (mobs.get(x).HitBox().collisionCheck(player.HitBox()))
				mobs.get(x).collide(player);
			mobs.get(x).move();
			if (mobs.get(x).getHealth() <= 0) {
				mobs.remove(x);
				x--;
				score += 5;
			}
		}
		for(int n = 0; n < floorDrops.size(); n++){
			if(floorDrops.get(n).HitBox().collisionCheck(player.HitBox())){
				floorDrops.remove(n).collide(player);
				n--;
				score += 10;
			}
		}
		player.move();

	}
	
	public Player player(){
		return player;
	}

	public boolean kill() { // ends game if troo(player is dead)
		return player.getHealth() <= 0;
	}
}
