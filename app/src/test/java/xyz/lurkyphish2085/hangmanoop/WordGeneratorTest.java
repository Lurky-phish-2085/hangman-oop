package xyz.lurkyphish2085.hangmanoop;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordGeneratorTest {

	@Test
	void generatesWord() {
		var words = new WordList(getClass().getClassLoader().getResourceAsStream("words_test.txt"));
		var wordgen = new WordGenerator(words);

		List<String> wordsList = words.getList();
		String word = wordgen.generate().toString();

		assertNotNull(word);
		assertTrue(wordsList.contains(word));
	}
}
