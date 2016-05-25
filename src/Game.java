
public class Game {

	public static Music m;

	public static void main(String[] args) {
		Game game = new Game();
	}

	public Game() {
		m = new Music("assets//audio//music//Local Forecast - Elevator.ogg");
		m.loop();
		GameMenu.main(null);
	}

}
