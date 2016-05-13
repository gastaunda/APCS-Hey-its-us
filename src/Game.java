
public class Game 
{

	public static void main(String[] args) {
		Game game = new Game();
	}

	public Game() {
		GameMenu.main(null);
		Music m = new Music("There is no game.ogg");
		m.loop();
	}

}
