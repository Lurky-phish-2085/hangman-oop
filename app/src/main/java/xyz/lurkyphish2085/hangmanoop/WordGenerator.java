package xyz.lurkyphish2085.hangmanoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGenerator {

	private WordList list;
	private Random random = new Random();

	public WordGenerator(WordList list) {
		this.list = list;
	}

	public Word generate() {
		Word word = list.popWordAt(random.nextInt(list.size()));
		return word;
	}

	public List<Word> generate(int count) {
		List<Word> words = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			words.add(generate());
		}

		return words;
	}
}
