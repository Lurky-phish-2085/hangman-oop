package xyz.lurkyphish2085.hangmanoop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WordList {

	private final Scanner FILE;
	private final List<String> LIST;
	private final String legalCharacters = "[a-zA-Z\s\\n\\-']+";

	public WordList(File source) throws IOException, FileNotFoundException, IllegalArgumentException {
		if (!isFileValid(source)) {
			throw new IllegalArgumentException("Supplied file is not a plain text");
		}

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

	public Word getWord(int index) {
		return new Word(LIST.get(index));
	}

	public int size() {
		return LIST.size();
	}

	public Word popWordAt(int index) {
		return new Word(LIST.remove(index));
	}

	private final boolean isFileValid(File file) throws IOException {
		String mimetype = Files.probeContentType(file.toPath());

		return mimetype.equals("text/plain");
	}

	private final boolean hasLegalCharacters(String word) {
		return word.matches(legalCharacters);
	}

	private final List<String> parseWords(Scanner file) throws IllegalArgumentException {
		List<String> words = new ArrayList<>();

		String word;
		while (file.hasNext()) {
			word = file.next();

			if (!hasLegalCharacters(word)) {
				throw new IllegalArgumentException("Text file supplied has invalid characters");
			}

			words.add(word);
		}

		if (words.size() == 0) {
			throw new IllegalArgumentException("Text file supplied is empty");
		}

		return words;
	}
}
