package xyz.lurkyphish2085.hangmanoop;

import java.io.InputStream;
import java.util.LinkedList;

public class Game {

	private Player player = new Player();
	private LinkedList<Word> words = new LinkedList<>();
	private WordGenerator wordgen;

	public Game() {
		InputStream source = getClass().getClassLoader().getResourceAsStream("words_test.txt");
		wordgen = new WordGenerator(new WordList(source));

		words.add(new Word(wordgen.generate()));
		words.add(new Word(wordgen.generate()));
		words.add(new Word(wordgen.generate()));
	}

	public void play() {
		System.out.println("HANGMAN PROTOTYPE\n");
		Word word = null;

		while (!words.isEmpty()) {
			word = words.pop();

			System.out.println("WORDS LEFT: " + (words.size() + 1) + "\n");

			while (!word.isComplete()) {
				System.out.println("\t" + word.getMaskedWord() + "\n");
				System.out.print("> ");
				String guess = GameHelper.getUserInput();

				if (!guess.isEmpty()) {
					word.revealLetter(guess.charAt(0));
				}

				System.out.println();
			}

			System.out.println("\t" + word.getWord().replace("", " "));
			System.out.println("COMPLETE!\n");
		}

		System.out.println("GAME OVER");
	}
}
