package xyz.lurkyphish2085.hangmanoop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordList {

	private final Scanner FILE;
	private final List<String> LIST;

	public WordList(File source) throws IllegalArgumentException, FileNotFoundException {
		FILE = new Scanner(source);
		LIST = parseWords(FILE);
		FILE.close();
	}

	public WordList(InputStream source) {
		FILE = new Scanner(source);
		LIST = parseWords(FILE);
		FILE.close();
	}

	public List<String> getList() {
		return new ArrayList<>(LIST);
	}

	public String getWord(int index) {
		return LIST.get(index);
	}

	private final List<String> parseWords(Scanner file) {
		ArrayList<String> words = new ArrayList<>();

		while (file.hasNext()) {
			words.add(file.next());
		}

		return words;
	} 

	/* TODO
	private final boolean isFileValid(File file) {

	}
	**/
}
