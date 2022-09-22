package xyz.lurkyphish2085.hangmanoop;

public class Player {
	
	private int attempts;
	private int score;

	public int getAttempts() {
		return attempts;
	}

	public int getScore() {
		return score;
	}

	public char guess() {
		attempts++;
		return GameHelper.getUserInput().charAt(0);
	}

	public void incrementScore() {
		score++;
	}

	public void incrementScore(int increment) {
		score += increment;
	}
}
