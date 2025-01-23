package masterMind30;

public class Mastermind2 {

	public static void main(String[] args) {

		/*
		 * Introduction to the game
		 */

		System.out.println("Welcome to Mastermind,Pick four colors,You have 10 chances");
		System.out.println(
				"If you get a X, it means you have it at the right place, if its W, it means it is at the wrong place and none of both means it doesn't exist.");
		System.out.println("Pickable colors: R,Y,G,B,P,O");
		System.out.println("Turn on caps lock, this will be handy, type in one line with spaces between each letter");

		/* Import the function to main */

		FunctieMastermind2 functie = new FunctieMastermind2();

		/* Generate code function */
		functie.generateCode();

		/* Play 10 rounds */
		for (int roundTen = 1; roundTen <= 10; roundTen++) {

			System.out.println("");

			System.out.println("Round " + roundTen);

			System.out.println("Pickable colors: R,Y,G,B,P,O");

			/* Asks for input */
			functie.userInput();

			/* Code to check */
			functie.ifElse();

			/* How to win */

			if (functie.howtoWin()) {
			} else {
				System.out.println("Het spel stopt hier.");
				System.out.println("Bedankt voor het spelen!");
				break;
			}

			if (roundTen == 9) {
				System.out.println("Last chance!");
			}

			if (roundTen >= 10) {
				System.out.println("You lost ! ! !" + " The code was: " + functie.allCodes);
				break;
			}
		}
	}
}
