package xyz.lurkyphish2085.hangmanoop;

public final class InformationPrinter {

	private InformationPrinter() {}

	public static void printUsage() {

	}

	public static void printVersion() {
		System.out.println("Hangman-OOP " +
				InformationPrinter.class.getPackage().getImplementationVersion());
		System.out.println("\nWritten by Lurky-phish-2085");
		System.out.println("See my GitHub profile: https://github.com/Lurky-phish-2085");
		System.out.println("See my GitHub page: https://lurky-phish-2085.github.io");
	}
}
