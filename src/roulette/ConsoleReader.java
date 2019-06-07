package roulette;

import java.io.*;
import java.util.*;

/**
 * Provides variety of methods to simplify getting user input from console.
 * 
 * @author Robert C. Duvall
 */
public class ConsoleReader {
	
	// by default, read input from the user's console
	private static Scanner in = new Scanner(new InputStreamReader(System.in));
	
	public static void setInput(InputStreamReader inputStream) {
		in = new Scanner(inputStream);
	}

	public static int promptInt(String prompt) {
		while (true) {
			try {
				return Integer.parseInt(promptString(prompt));
			} catch (NumberFormatException e) {
				// silently handle non-numeric input and re-prompt
			}
		}
	}

	public static String promptString(String prompt) {
		System.out.print(prompt);
		return in.next();
	}

	public static int promptRange(String prompt, int low, int hi) {
		int answer;

		do {
			answer = promptInt(prompt + " between " + low + " and " + hi + "? ");
		} while (low > answer || answer > hi);

		return answer;
	}

	public static boolean promptYesNo(String prompt) {
		String answer;

		do {
			answer = promptString(prompt + " (yes or no)? ");
		} while (!answer.equals("yes") && !answer.equals("no"));

		return (answer.equals("yes"));
	}

	public static String promptOneOf(String prompt, Set<String> choices) {
		String result;

		do {
			result = promptString(prompt + " on one of " + choices + "? ");
		} while (!choices.contains(result));

		return result;
	}
}
