package xyz.lurkyphish2085.hangmanoop;

public class Word {

	private final String WORD;

	private StringBuilder maskedWord;
	private char mask = '-';

	public Word(String word) {
		this.WORD = word;
		maskedWord = maskWord(word);
	}

	public Word(String word, char mask) {
		this.WORD = word;
		this.mask = mask;
		maskedWord = maskWord(word);
	}
	
	public String getWord() {
		return WORD;
	}

	public String getMaskedWord() {
		return maskedWord.toString().replace("", " ");
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
		if (!WORD.contains(String.valueOf(letter))) {
				return false;
		}

		for (int i = 0; i < WORD.length(); i++) {
				if (WORD.charAt(i) == letter) {
						maskedWord.setCharAt(i, letter);
				}
		}

		return true;
	}

	public boolean isComplete() {
		return WORD.equals(maskedWord.toString());
	}
}
