package xyz.lurkyphish2085.hangmanoop;

import java.io.InputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordListTest {

	/* TODO
	@Test
	void validatesFile() {
		InputStream input = getClass().getClassLoader().getResourceAsStream("non-text.mid");
		assertThrows(IllegalArgumentException.class,
				() -> {
					var words = new WordList(input);
				});
	}
	*/

	@Test
	void parsesAFile() {
		InputStream input = getClass().getClassLoader().getResourceAsStream("words_test.txt");
		var words = new WordList(input);

		String[] items = {"tunnel", "turn", "TV"};

		assertNotNull(words.getList());
		assertTrue(words.getList().size() == items.length);
		assertTrue(words.getWord(0).equals(items[0]));
	}
}
