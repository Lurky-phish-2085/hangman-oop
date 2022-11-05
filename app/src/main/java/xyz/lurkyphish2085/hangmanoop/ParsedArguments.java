package xyz.lurkyphish2085.hangmanoop;

import java.io.File;

final class ParsedArguments {

	private File FILE;
	private int WORDS_COUNT;

	public File getFile() {
		return FILE;
	}

	public int getWordsCount() {
		return WORDS_COUNT;
	}

	public void setFile(File file) {
		if (!file.exists()) {
			throw new IllegalArgumentException("No such file exists");
		}

		FILE = file;
	}

	public void setWordsCount(int count) {
		if (count < 1) {
			throw new IllegalArgumentException("count should not be lower than 1");
		}

		WORDS_COUNT = count;
	}
}
