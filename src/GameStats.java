public class GameStats {

	int health;
	int score;
	// score into money later

	public GameStats(int inputhealth, int inputscore) {
		health = inputhealth;
		score = inputscore;
	}

	public void LoseHealth(int lost) {
		health -= lost;
	}

	public void addHealth(int add) {
		health += add;
	}

	public void addScore(int add) {
		score += add;
	}

	public int getScore() {
		return score;
	}

	public int getHealth() {
		return health;
	}

}
