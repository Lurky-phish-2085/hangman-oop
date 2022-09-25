package xyz.lurkyphish2085.hangmanoop;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordListTest {

	@Test
	void validatesFile() {
		URI source = null;
		try {
			source = getClass().getClassLoader().getResource("non-text.mid").toURI();
		} catch (URISyntaxException use) {
			use.printStackTrace();
		}

		File file = new File(source);
		assertThrows(IllegalArgumentException.class,
				() -> {
					new WordList(file);
				});
	}

	@Test
	void validatesFileContent() {
		URI source = null;
		try {
			source = getClass().getClassLoader().getResource("words_test_illegal.txt").toURI();
		} catch (URISyntaxException use) {
			use.printStackTrace();
		}

		File file = new File(source);
		assertThrows(IllegalArgumentException.class,
				() -> {
					new WordList(file);
				});
	}

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
