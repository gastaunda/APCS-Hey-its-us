package GUIPractice;

import items.Door;
import items.EntityList;
import items.Floor;
import items.KillBlock;
import items.Pickup;
import items.Wall;
import mobs.Mob;

public class LevelBuild {
	public static void buildLevel(int k, EntityList lischt){
		if(k == 1)
			level1(lischt);
		if(k == 2)
			level2(lischt);
	}
	private static void level1(EntityList lischt){
		for (double i = -64; i <= 800; i += 32){
			lischt.add(new KillBlock(16, -64, i));
		}
		for(double i = -64; i <= 1800; i += 32){
			lischt.add(new KillBlock(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 32){
			lischt.add(new KillBlock(16, 1800, i));
		}
		for (double i = 0; i <= 100; i += 32) {
			lischt.add(new Floor(16, i, 200));
		}
		lischt.add(new Floor(12, 350, 245));
		for (double i = 350; i <= 1500; i += 32){
			lischt.add(new Floor(16, i, 500));
		}
		for (double i = 250; i <= 500; i += 64){
			lischt.add(new Wall(16, 350, i));
		}
		for (double i = 400; i <= 800; i += 50){
			lischt.add(new Mob(100, 100, 1, (double) i, (double) 200, (double) 16, (double) 16));
		}
		lischt.add(new Pickup(16,1000,350, 0));
		lischt.add(new Pickup(16,900, 350, 1));
		lischt.add(new Pickup(16,800, 350, 2));
		lischt.add(new Pickup(16,1100,350, 3));
		lischt.add(new Door(16, 1400, 468));
	}
	private static void level2(EntityList lischt){
		
	}
}
