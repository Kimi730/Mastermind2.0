package masterMind30;

import java.util.Random;
import java.util.Scanner;

public class Mastermind2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Mastermind,Pick four colors,You have 10 chances");
		System.out.println(
				"If you get a X, it means you have it at the right place, if its W, it means it is at the wrong place and none of both means it doesn't exist.");
		System.out.println("Turn on caps lock, this will be handy, type in one line with spaces between each letter");
		System.out.println("Pickable colors: R,Y,G,B,P,O");
		
		FunctieMastermind2 functie = new FunctieMastermind2();
		
		String[] pickColors = { "R", "Y", "G", "B", "P", "O" };

		String[] checkColors = { "X", "W" };

		Random rand = new Random();

		String[] secretCodes = new String[4];
		for (int x = 0; x < secretCodes.length; x++) {
			secretCodes[x] = pickColors[rand.nextInt(6)];
		}

		Scanner sc = new Scanner(System.in);

		for (int roundTen = 1; roundTen <= 10; roundTen++) {

			System.out.println("");

			System.out.println("Round " + roundTen);

			String[] playerGuess = new String[4];

			for (int j = 0; j < playerGuess.length; j++)

				playerGuess[j] = sc.next();

			if (playerGuess[0].equals(secretCodes[0])) {
				System.out.print(checkColors[0]);
			} else if (playerGuess[0].equals(secretCodes[1]) || playerGuess[0].equals(secretCodes[2])
					|| playerGuess[0].equals(secretCodes[3])) {
				System.out.print(checkColors[1]);
			} else {
				System.out.print("  ");
			}

			if (playerGuess[1].equals(secretCodes[1])) {
				System.out.print(" " + checkColors[0]);
			} else if (playerGuess[1].equals(secretCodes[0]) || playerGuess[1].equals(secretCodes[2])
					|| playerGuess[1].equals(secretCodes[3])) {
				System.out.print(" " + checkColors[1]);
			} else {
				System.out.print("  ");
			}

			if (playerGuess[2].equals(secretCodes[2])) {
				System.out.print(" " + checkColors[0]);
			} else if (playerGuess[2].equals(secretCodes[0]) || playerGuess[2].equals(secretCodes[1])
					|| playerGuess[2].equals(secretCodes[3])) {
				System.out.print(" " + checkColors[1]);
			} else {
				System.out.print("  ");
			}

			if (playerGuess[3].equals(secretCodes[3])) {
				System.out.print(" " + checkColors[0]);
			} else if (playerGuess[3].equals(secretCodes[0]) || playerGuess[3].equals(secretCodes[1])
					|| playerGuess[3].equals(secretCodes[2])) {
				System.out.print(" " + checkColors[1]);
			} else {
				System.out.print("  ");
			}

			String allCorrect = playerGuess[0] + playerGuess[1] + playerGuess[2] + playerGuess[3];
			String allCodes = secretCodes[0] + secretCodes[1] + secretCodes[2] + secretCodes[3];
			if (allCodes.equals(allCorrect)) {
				System.out.println("");
				System.out.println("Gongratulations ! ! !");
				break;
			}

			if (roundTen >= 10) {
				System.out.println("You lost ! ! !");
				sc.close();
			}
		}
	}
}
