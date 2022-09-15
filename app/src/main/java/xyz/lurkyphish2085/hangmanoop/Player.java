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
		return GameHelper.getUserInput().charAt(0);
		attempts++;
	}

	public void incrementScore() {
		score++;
	}

	public void incrementScore(int increment) {
		score += increment;
	}
}
