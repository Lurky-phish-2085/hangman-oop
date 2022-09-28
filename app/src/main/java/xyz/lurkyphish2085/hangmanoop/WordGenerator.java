package xyz.lurkyphish2085.hangmanoop;

import java.util.Random;

public class WordGenerator {

	private final int LIST_SIZE;

	private WordList list;
	private Random random = new Random();

	public WordGenerator(WordList list) {
		this.list = list;
		LIST_SIZE = list.getList().size();
	}

	public String generate() {
		return list.getWord(random.nextInt(LIST_SIZE));
	}
}
