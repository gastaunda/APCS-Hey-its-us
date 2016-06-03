package GUIPractice;

import items.Door;
import items.EntityList;
import items.Floor;
import items.KillBlock;
import items.Pickup;
import items.UpFloor;
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
		case 5:
			level5(lischt);
			break;
		case 6:
			level6(lischt);
			break;
		case 7:
			level7(lischt);
			break;
		case 8:
			level8(lischt);
			break;
		case 9:
			level9(lischt);
			break;
		}
			
	}

	private static void level1(EntityList lischt) {//Initial/Tester level
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
			lischt.add(new Mob(5, 2, 1, (double) i, (double) 200, (double) 16, (double) 16));
		}
		lischt.add(new Pickup(16, 1000, 350, 0));
		lischt.add(new Pickup(16, 900, 350, 1));
		lischt.add(new Pickup(16, 800, 350, 2));
		lischt.add(new Pickup(16, 1100, 350, 3));
		lischt.add(new Door(16, 1400, 468));
	}

	private static void level2(EntityList lischt) {//Anubhav's Level
		for (double i = -256; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, -64, i));
		}
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, 1800, i));
		}
		for (double i = -64; i <= 1700; i += 32) {
			lischt.add(new UpFloor(16, i, 105));
			lischt.add(new Floor(16, i, 100));
			lischt.add(new UpFloor(16, i, 505)); 
			lischt.add(new Floor(16, i, 500));
			
		}
		for (double i = 192; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 400));
			lischt.add(new Floor(16, i, 700));
		}
		for (double i = 192; i <= 1700; i += 128) {
			lischt.add(new KillBlock(16, i, 368));
			lischt.add(new KillBlock(16, i, 532));
			lischt.add(new Mob(5, 5, 1, (double) i + 64, (double) 368, (double) 16, (double) 16));
			lischt.add(new Mob(5, 5, 1, (double) i + 64, (double) 668, (double) 16, (double) 16));
		}
		lischt.add(new Pickup(16, 50, 50, 1));
		lischt.add(new Pickup(16, 100, 50, 1));
		lischt.add(new Pickup(16, 150, 50, 0));
		lischt.add(new Pickup(16, 200, 50, 3));
		lischt.add(new Pickup(16, 250, 50, 3));
		lischt.add(new Pickup(16, 350, 450, 0));
		lischt.add(new Pickup(16, 400, 450, 2));
		lischt.add(new Door(16, 1750, 750));
	}

	private static void level3(EntityList lischt) {//Josh's Level

		for (int i = 0; i <= 200; i += 32) {
			lischt.add(new Floor(16, i, 200));
		}

		for (double i = 300; i <= 1450; i += 128) {
			lischt.add(new Floor(16, i, 300));
		}

		for (double i = -64; i <= 1800; i += 32) {      //surrounding kill blocks
			lischt.add(new KillBlock(16, i, 1032));		//horizontal
		}
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, 1932, i));  //vertical right
		}
		
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, -64, i));  //vertical left
		}
		
		for (double i = 350; i <= 1500; i += 128) {
			lischt.add(new KillBlock(16, i, 300));
		}

		for (double i1 = 350; i1 <= 1500; i1 += 32) {
			lischt.add(new Floor(16, i1, 500));
		}

		for (double i2 = 350; i2 <= 1500; i2 += 32) {
			lischt.add(new Floor(16, i2, 500));
		}

		for (double i2 = 350; i2 <= 1500; i2 += 32) {
			lischt.add(new Mob(5, 2, 1, (double) i2, (double) 200, (double) 16, (double) 16));
			lischt.add(new Mob(5, 2, 1, (double) i2, (double) 400, (double) 16, (double) 16));
		}

		for (double i1 = 1500; i1 <= 3000; i1 += 64) {
			lischt.add(new Floor(16, i1, 900));
		}
		lischt.add(new Door(16, 1825, 858));

	}

	private static void level4(EntityList lischt) {//random level by Will
		double ran = 0;
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, -64, i));
		}
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 64) {
			lischt.add(new KillBlock(16, 1800, i));
		}
		for (double x = 128; x <= 1700; x += 64) {
			for (double y = 128; y <= 800; y += 64) {
				ran = Math.random();
				if (ran <= .075) {
					lischt.add(new Wall(16, x, y));
					lischt.add(new Floor(16, x, y));
					lischt.add(new Mob(2, 2, 1, x, y-32, 16, 16));
				} else if (ran <= .15)
					lischt.add(new KillBlock(16, x, y));
				
			}
		}
		lischt.add(new Door(16, 1700, 700));
	}

	private static void level5(EntityList lischt) { // by Will
		for (double i = -64; i <= 1000; i += 64) {
			lischt.add(new KillBlock(16, -64, i));
		}
		for (double i = -64; i <= 1900; i += 32) {
			lischt.add(new Floor(16, i, 1000));
		}
		for (double i = 288; i <= 1900; i += 64) {
			lischt.add(new Mob(2, 2, 1, i, 900, 16, 16));
		}
		for (double i = -64; i <= 1000; i += 64) {
			lischt.add(new KillBlock(16, 1900, i));
		}
		for (double i = 32; i <= 800; i += 64) {
			lischt.add(new Wall(16, 128, i));
		}
		lischt.add(new UpFloor(16, 128, 800));
		for (double i = 128; i <= 1000; i += 64) {
			lischt.add(new Wall(16, 256, i));
		}
		
		for (double i = 288; i <= 1600; i += 32) {
			lischt.add(new UpFloor(16, i, 128));
		}
		lischt.add(new Floor(16, 256, 128));
		for (double i = 1600; i <= 1900; i +=32){
			lischt.add(new Floor(16,i, 128));
		}
		lischt.add(new Door(16, 1800, 96));
	}

	public static int random(int x) {
		return (int) (Math.random() * x);
	}
	
	public static void level6(EntityList lischt)
	{
		int counter = 0;
		for (double i = 0; i <= 100; i += 32) {
			lischt.add(new Floor(16, i, 200));
		}
		
		for (double i2 = 350; i2 <= 1500; i2 += 32) {
			lischt.add(new Mob(5, 2, 1, (double) i2, (double) 200, (double) 16, (double) 16));

		}
		
		for (double i = -64; i <= 1800; i += 32) {      //surrounding kill blocks
			lischt.add(new KillBlock(16, i, 1032));		//horizontal
		}
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, 1932, i));  //vertical right
		}
		
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, -64, i));  //vertical left
		}
		
		for (double i = -64; i <= 1700; i += 32) {
			lischt.add(new Floor(16, i, 700));
		}
		
		for (double i = -64; i <= 1700; i += 32) {
			lischt.add(new Floor(16, i, 700));
			if (counter % 16 == 0)
			{
				lischt.add(new KillBlock(16,i, 700 - random(300)));
				for (double j = 700; j >= 500; j = j-50)
				{
					lischt.add(new Floor(16, i*random(32), j));
				}
			}
		}
		lischt.add(new Door(16, 1700, 700));
	}

	private static void level7(EntityList lischt){//NEEDS TO BE MADE
		//button "6"
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, 1800, i));
			lischt.add(new KillBlock(16, -64, i));
		}
		lischt.add(new Door(16, 1750, 750));
	}

	private static void level8(EntityList lischt){//NEEDS TO BE MADE
		//button "7"
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, 1800, i));
			lischt.add(new KillBlock(16, -64, i));
		}
		lischt.add(new Door(16, 1750, 750));
	}
	
	private static void level9(EntityList lischt){//NEEDS TO BE TESTED(BY ANUBHAV)
		//button "8"
		for (double i = -64; i <= 1800; i += 32) {
			lischt.add(new Floor(16, i, 800));
		}
		for (double i = -64; i <= 800; i += 32) {
			lischt.add(new KillBlock(16, 1800, i));
			lischt.add(new KillBlock(16, -64, i));
		}
		for(double i = -64; i <= 256; i += 32){
			lischt.add(new Floor(16, i, 64));
		}
		for (double i = 300; i <= 500; i += 32){
			lischt.add(new Floor(16, i, 256));
		}
		for (double i = 300; i <= 500; i += 96){
			lischt.add(new Mob(2, 2, 1, (double) i, (double) 256, (double) 16, (double) 16));
		}
		for (double i = 0; i <= 1800; i += 64)
		{
			lischt.add(new Mob(2, 2, 1, (double) i, (double) 750, (double) 16, (double) 16));
		}
		lischt.add(new Door(16, 64, 750));
		for (double i = 0; i <= 1800; i += 128){
			lischt.add(new KillBlock(16, i, 350));
		}
	}
}
