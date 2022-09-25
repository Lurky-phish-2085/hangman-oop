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

	public WordList(File source) throws IllegalArgumentException, FileNotFoundException {
		try {
			if (!isFileValid(source) || !hasLegalCharacters(source)) {
				throw new IllegalArgumentException("supplied file may not be a text file or contains illegal characters.");
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
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

	public String getWord(int index) {
		return LIST.get(index);
	}

	private final boolean isFileValid(File file) throws IOException {
		String mimetype = Files.probeContentType(file.toPath());

		return mimetype.equals("text/plain");
	}

	private final boolean hasLegalCharacters(File textFile) throws FileNotFoundException {
		Scanner file = new Scanner(textFile);
		String pattern = "[a-zA-Z\s\\n\\-']+"; // true if string has upper and
											   // lower alpha, spaces,
											   // newlines, dashes, and
											   // apostrophes

		while (file.hasNextLine()) {
			if (!file.nextLine().matches(pattern)) {
				return false;
			}
		}

		return true;
	}

	private final List<String> parseWords(Scanner file) {
		ArrayList<String> words = new ArrayList<>();

		while (file.hasNext()) {
			words.add(file.next());
		}

		return words;
	} 
}
