package GUIPractice;

import items.Door;
import items.EntityList;
import items.Floor;
import items.KillBlock;
import items.Pickup;
import items.Wall;
import mobs.Mob;

public class LevelBuild {
	public static void buildLevel(int k, EntityList lischt) {
		switch (k) {
		case 1:
			level1(lischt);
			break;
		case 2:
			level2(lischt);
			break;
		case 3:
			level3(lischt);
			break;
		case 4:
			level4(lischt);
			break;
		}
	}

	private static void level1(EntityList lischt) {
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new Wall(16, -64, i));
		}
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new KillBlock(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, 1800, i));
		}
		for (double i = 0; i <= 100; i += 32) {
			lischt.add(new Floor(16, i, 200));
		}
		lischt.add(new Floor(12, 350, 245));
		for (double i = 350; i <= 1500; i += 32) {
			lischt.add(new Floor(16, i, 500));
		}
		for (double i = 250; i <= 500; i += 64) {
			lischt.add(new Wall(16, 350, i));
		}
		for (double i = 400; i <= 800; i += 50) {
			lischt.add(new Mob(100, 100, 1, (double) i, (double) 200, (double) 16, (double) 16));
		}
		lischt.add(new Pickup(16, 1000, 350, 0));
		lischt.add(new Pickup(16, 900, 350, 1));
		lischt.add(new Pickup(16, 800, 350, 2));
		lischt.add(new Pickup(16, 1100, 350, 3));
		lischt.add(new Door(16, 1400, 468));
	}

	private static void level2(EntityList lischt) {
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, -64, i));
		}
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, 1800, i));
		}
		for (double i = -64; i <= 1700; i += 32) {
			lischt.add(new Floor(16, i, 100));
			lischt.add(new Floor(16, i, 500));
			lischt.add(new Floor(16, i, 700));
		}
		for (double i = 64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 400));
		}
		for (double i = 64; i <= 1700; i += 128) {
			lischt.add(new KillBlock(16, i, 368));
			lischt.add(new Mob(100, 100, 1, (double) i + 64, (double) 368, (double) 16, (double) 16));
		}
<<<<<<< HEAD
		lischt.add(new Pickup(16, 50, 50, 1));
		lischt.add(new Door(16, 1750, 750));
		
=======

>>>>>>> origin/master
	}
	private static void level3(EntityList lischt)
	{
		
		for (int i = 0; i <= 200; i += 32)
		{
			lischt.add(new Floor(16,i,200));
		}
		
		for (double i = 300; i <= 1450; i += 128){
			lischt.add(new Floor(16, i, 300));
		}
		
		for (double i = 350; i <= 1500; i += 128){
			lischt.add(new KillBlock(16, i, 300));
		}
		
		for (double i1 = 350; i1 <= 1500; i1 += 32)
		{
			lischt.add(new Floor(16, i1, 500));
		}
		
		for (double i2 = 350; i2 <= 1500; i2 += 32)
		{
			lischt.add(new Floor(16, i2, 500));
		}
		
		for (double i2 = 350; i2 <= 1500; i2 += 32)
		{
			lischt.add(new Mob(100, 100, 1, (double) i2, (double) 200, (double) 16, (double) 16));
			lischt.add(new Mob(100, 100, 1, (double) i2, (double) 400, (double) 16, (double) 16));
		}
		
		for (double i1 = 1500; i1 <= 3000; i1 += 64)
		{
			lischt.add(new Floor(16, i1, 900));
		}
		lischt.add(new Door(16, 1825, 858));
		
	}

	private static void level4(EntityList lischt) {
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, -64, i));
		}
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, 1800, i));
		}
	}

	public static int random(int x) {
		return (int) (Math.random() * x);
	}
}
