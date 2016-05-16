
import java.awt.image.BufferedImage;

import items.GameEntity;

public class Level {
	private Block[][] map;
	private BufferedImage foreground;
	private BufferedImage background;
	private BufferedImage[] sprites;
	private GameEntity[] entities;
	
	public BufferedImage[] getSprites() {
		return sprites;
	}
}
