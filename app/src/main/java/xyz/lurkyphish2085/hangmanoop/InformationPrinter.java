package xyz.lurkyphish2085.hangmanoop;

import com.jcabi.manifests.Manifests;

public final class InformationPrinter {

	private InformationPrinter() {}

	public static void printUsage() {

	}

	public static void printVersion() {
		System.out.println("Hangman-OOP " + Manifests.read("Manifest-Version"));
		System.out.println("\nWritten by Lurky-phish-2085");
		System.out.println("See my GitHub profile: https://github.com/Lurky-phish-2085");
		System.out.println("See my GitHub page: https://lurky-phish-2085.github.io");
	}
}
