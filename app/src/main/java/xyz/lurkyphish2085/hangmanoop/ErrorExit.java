package xyz.lurkyphish2085.hangmanoop;

public class ErrorExit {

	public ErrorExit(Exception ex) {
		printMessage(ex.getMessage());
		System.exit(1);
	}

	public ErrorExit(String message) {
		printMessage(message);
		System.exit(1);
	}

	public ErrorExit(String message, int exitCode) {
		if (exitCode < 0) {
			throw new IllegalArgumentException("exit code should never be negative");
		}

		printMessage(message);
		System.exit(exitCode);
	}

	private void printMessage(String message) {
		System.err.println("hangman: " + message);
		System.err.println("Try 'hangman' -h' for more information");
	}
}
