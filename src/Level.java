
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import items.GameEntity;
import items.GameObject;
import mobs.Player;

public class Level {
	private Block[][] map;
	private BufferedImage foreground;
	private BufferedImage background;
	private BufferedImage[] sprites;
	private GameEntity[] entities;
	
	
	ImageIcon playerimage = new ImageIcon("LH_95.jpg");
	public BufferedImage[] getSprites() {
		return sprites;
	}
	
	public void loadlevel()
	{
		Player myPlayer = new Player(100,100,new GameObject[10],0,0,10,5,playerimage);
		GUIHandler gui = new GUIHandler(myPlayer);
	}
}
