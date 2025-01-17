package masterMind30;

import java.util.Random;
import java.util.Scanner;

public class FunctieMastermind2 {

	String[] secretCodes = new String[4];

	String[] playerGuess = new String[4];

	String allCorrect;

	String allCodes;

	public String[] generateCode() {

		String[] pickColors = { "R", "Y", "G", "B", "P", "O" };

		Random rand = new Random();

		for (int x = 0; x < secretCodes.length; x++) {
			secretCodes[x] = pickColors[rand.nextInt(6)];
		}

		allCodes = secretCodes[0] + secretCodes[1] + secretCodes[2] + secretCodes[3];

		return secretCodes;
	}

	public void userInput() {

		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < playerGuess.length; j++) {
			playerGuess[j] = sc.next();
			allCorrect = playerGuess[0] + playerGuess[1] + playerGuess[2] + playerGuess[3];
			}
		}

	public void howtoWin() {

		if (allCodes.equals(allCorrect)) {

			System.out.println("");
			System.out.println("Gongratulations ! ! !");

		}
	}

	public String[] ifElse() {

		String[] checkColors = { "X", "W" };

		if (playerGuess[0].equals(secretCodes[0])) {
			System.out.print(checkColors[0] + " ");
		} else if (playerGuess[0].equals(secretCodes[1]) || playerGuess[0].equals(secretCodes[2])
				|| playerGuess[0].equals(secretCodes[3])) {
			System.out.print(checkColors[1] + " ");
		} else {
			System.out.print("  ");
		}

		if (playerGuess[1].equals(secretCodes[1])) {
			System.out.print(checkColors[0] + " ");
		} else if (playerGuess[1].equals(secretCodes[0]) || playerGuess[1].equals(secretCodes[2])
				|| playerGuess[1].equals(secretCodes[3])) {
			System.out.print(checkColors[1] + " ");
		} else {
			System.out.print("  ");
		}

		if (playerGuess[2].equals(secretCodes[2])) {
			System.out.print(checkColors[0] + " ");
		} else if (playerGuess[2].equals(secretCodes[0]) || playerGuess[2].equals(secretCodes[1])
				|| playerGuess[2].equals(secretCodes[3])) {
			System.out.print(checkColors[1] + " ");
		} else {
			System.out.print("  ");
		}

		if (playerGuess[3].equals(secretCodes[3])) {
			System.out.print(checkColors[0] + " ");
		} else if (playerGuess[3].equals(secretCodes[0]) || playerGuess[3].equals(secretCodes[1])
				|| playerGuess[3].equals(secretCodes[2])) {
			System.out.print(checkColors[1] + " ");
		} else {
			System.out.print("  ");
		}

		return checkColors;
	}
}