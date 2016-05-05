import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Block {
	private boolean solid;
	private BufferedImage img;
	private boolean jumpThrough;
	
	public Block(boolean solidB, boolean jumpThroughB, String img) throws IOException {
		ImageIO.read(new File(img));
	}
}
