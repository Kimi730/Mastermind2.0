package masterMind30;

import java.util.Scanner;
import java.util.Arrays;

public class MastermindB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Mastermind, Pick four colors, You have 10 chances");
		System.out.println("If you get an X, it means you have it at the right place, if it's W, it means it is at the wrong place and none of both means it doesn't exist.");
		System.out.println("Turn on caps lock, this will be handy, type in one line with spaces");
		System.out.println("Pickable colors: R, Y, G, B, P, O");

		String[] colors = { "R", "Y", "G", "B", "P", "O" };
		
		String[] codes = { colors[5], colors[4], colors[3], colors[0] };

		for (int round = 1; round <= 10; round++) {
			System.out.println("Round " + round);

			String[] guess = new String[4];
			for (int j = 0; j < guess.length; j++) {
				guess[j] = sc.next().toUpperCase();
			}

			StringBuilder feedback = new StringBuilder();

			boolean[] codeChecked = new boolean[4];
			boolean[] guessChecked = new boolean[4];

			for (int i = 0; i < 4; i++) {
				if (guess[i].equals(codes[i])) {
					feedback.append("X ");
					codeChecked[i] = true;
					guessChecked[i] = true;
				}
			}

			for (int i = 0; i < 4; i++) {
				if (!guessChecked[i]) {
					for (int j = 0; j < 4; j++) {
						if (!codeChecked[j] && guess[i].equals(codes[j])) {
							feedback.append("W ");
							codeChecked[j] = true;
							break;
						}
					}
				}
			}

			while (feedback.length() < 4) {
				feedback.append(" ");
			}

			System.out.println(feedback);

			if (Arrays.equals(guess, codes)) {
				System.out.println("Congratulations! You've guessed the code!");
				break;
			}

			if (round == 10) {
				System.out.println("You lost! The correct code was: " + String.join(" ", codes));
			}
		}
		sc.close();
	}
}