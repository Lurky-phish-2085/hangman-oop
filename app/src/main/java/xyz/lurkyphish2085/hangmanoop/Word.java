package xyz.lurkyphish2085.hangmanoop;

public class Word {

	private final String word;
	private StringBuilder maskedWord;

	private char mask = '_';

	public Word(String word) {
		this.word = word;
		maskedWord = maskWord(word);
	}

	public Word(String word, char mask) {
		this.word = word;
		this.mask = mask;
		maskedWord = maskWord(word);
	}
	
	public String getWord() {
		return word;
	}

	public String getMaskedWord() {
		return maskedWord.toString();
	}

	public char getMask() {
			return mask;
	}

	private StringBuilder maskWord(String word) {
		StringBuilder maskedWord = new StringBuilder(word);
		for (int i = 0; i < word.length(); i++) {
				maskedWord.setCharAt(i, mask);
		}

		return maskedWord;
	}

	public boolean revealLetter(char letter) {
		if (!word.contains(String.valueOf(letter))) {
				return false;
		}

		for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
						maskedWord.setCharAt(i, letter);
				}
		}

		return true;
	}

	public boolean isComplete() {
		return word.equals(maskedWord.toString());
	}
}

