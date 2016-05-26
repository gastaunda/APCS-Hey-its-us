package aa;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Block {
	private byte mode;
	private BufferedImage img;
	
	/**
	 * 
	 * @param img
	 * @param mode
	 */
	public Block(String img, byte mode) {
		this.mode = mode;
		try {
			this.img = ImageIO.read(new File(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//This needs a defined boundaries so when player enters that boundary, they have a velY of 0 (they stand up on the block)