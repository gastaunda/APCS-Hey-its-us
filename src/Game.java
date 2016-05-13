
public class Game 
{

	public static void main(String[] args) {
		Music test = new Music("There is no game.ogg");
		test.play();
		Game game = new Game();
	}

	public Game() {
		GameMenu.main(null); 
		Music m = new Music("");
	}

}
