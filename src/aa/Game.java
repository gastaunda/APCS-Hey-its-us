package aa;
import javax.swing.JFrame;

public class Game {

	public static Music m;
	public static int winX = 0;
	public static int winY = 0;
	public static int winWidth = 1280;
	public static int winHeight = 720;
	public static int winState = JFrame.MAXIMIZED_BOTH;
	public static final String name = "BounceMan";

	public static void main(String[] args) {
		m = new Music("assets/audio/music/Local Forecast - Elevator.ogg");
		m.loop();
		GameMenu.main(null);
	}
}