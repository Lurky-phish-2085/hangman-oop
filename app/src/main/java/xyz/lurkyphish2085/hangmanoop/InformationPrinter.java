package xyz.lurkyphish2085.hangmanoop;

public final class InformationPrinter {

	private InformationPrinter() {}

	public static void printUsage() {
		System.out.println("Usage: hangman [ -h | -v ] [-n N] [CUSTOM_WORD_LIST_TEXT_FILE]");
		System.out.println("A word guessing game! Supplied text files are used as a custom");
		System.out.println("list of words to be guessed, overriding the default one.");
		System.out.println("");
		System.out.println("-n NUMBER\t" + "sets the number of words to be guessed.");
		System.out.println("-h\t\t" + "Shows this help message.");
		System.out.println("-v\t\t" + "Print version info and exit.");
	}

	public static void printVersion() {
		System.out.println("Hangman-OOP " +
							InformationPrinter.class.getPackage()
							.getImplementationVersion());

		// print license boilerplate here

		System.out.println("\nWritten by Lurky-phish-2085");
		System.out.println("See my GitHub profile at: https://github.com/Lurky-phish-2085");
		System.out.println("See my GitHub page at: https://lurky-phish-2085.github.io");
	}
}
