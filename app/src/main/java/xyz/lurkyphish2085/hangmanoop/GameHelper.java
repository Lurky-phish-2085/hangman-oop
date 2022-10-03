package xyz.lurkyphish2085.hangmanoop;

import java.io.IOException;
import java.util.Scanner;

public class GameHelper {

	private static final Scanner SCAN = new Scanner(System.in);
	private static final ProcessBuilder PROCESS = new ProcessBuilder();
	private static final String OS = System.getProperty("os.name");


	public static String getUserInput() {
			return SCAN.nextLine();
	}

	public static void clearScreen() {
		try {
			if (OS.equals("Windows")) {
				PROCESS.command("cmd", "/c", "cls");
				PROCESS.inheritIO().start().waitFor();
				return;
			}

			PROCESS.command("clear");
			PROCESS.inheritIO().start().waitFor();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
