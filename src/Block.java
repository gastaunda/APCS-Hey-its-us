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
