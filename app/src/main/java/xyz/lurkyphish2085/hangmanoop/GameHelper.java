package xyz.lurkyphish2085.hangmanoop;

import java.io.IOException;
import java.util.Scanner;

public final class GameHelper {

	private static final Scanner SCAN = new Scanner(System.in);
	private static final ProcessBuilder PROCESS = new ProcessBuilder();
	private static final String OS = System.getProperty("os.name");

	private GameHelper() {}

	public static String getUserInput() {
			return SCAN.nextLine();
	}

	public static void clearScreen() {
		boolean isWindows = OS.equals("Windows");
		String clear = isWindows ? "cmd /c cls" : "clear";

		PROCESS.command(clear);
		try {
			PROCESS.inheritIO().start().waitFor();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
