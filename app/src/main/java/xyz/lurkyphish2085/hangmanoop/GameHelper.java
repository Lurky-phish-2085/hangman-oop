package xyz.lurkyphish2085.hangmanoop;

import java.util.Scanner;

public class GameHelper {

	private static final Scanner scan = new Scanner(System.in);

	public static String getUserInput() {
			return scan.nextLine();
	}
}
