package xyz.lurkyphish2085.hangmanoop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {

	@Test
	void wordIsMaksed() {
		var word = new Word("Hello");

		assertNotEquals(word.getMaskedWord(), word.getWord());
		assertEquals(word.getMaskedWord().length(), word.getWord().length());
		assertTrue(word.getMaskedWord().contains(String.valueOf(word.getMask())));
	}

	@Test
	void letterRevealed() {
		var word = new Word("Hello");

		char letter = 'l';
		word.revealLetter(letter);

		assertTrue(word.getWord().contains(String.valueOf(letter)));
		assertTrue(word.getMaskedWord().contains(String.valueOf(letter)));
	}
}

