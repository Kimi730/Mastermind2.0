package masterMind30;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Mastermind,Pick four colors,You have 10 chances");
		System.out.println("If you get a X, it means you have it at the right place, if its W, it means it is at the wrong place and none of both means it doesn't exist.");
		System.out.println("Turn on caps lock, this will be handy, type in one line with spaces");
		System.out.println("Pickable colors: R,Y,G,B,P");

		String red = "R";
		String yellow = "Y";
		String green = "G";
		String blue = "B";
		String pink = "P";
		String orange = "O";
		String white = "W";
		String black = "X";
		
		Scanner sc = new Scanner(System.in);

		String code1 = yellow;
		String code2 = pink;
		String code3 = blue;
		String code4 = red;

		String gok1;
		String gok2;
		String gok3;
		String gok4;
		
		for (int round = 1; round <= 10; round++) {

			System.out.println("");
			
			System.out.println("Round " + round);
			
			
			gok1 = sc.next();
			gok2 = sc.next();
			gok3 = sc.next();
			gok4 = sc.next();

			
			if (gok1.equals(code1)) 
			{
				System.out.print(black);
			} else if (gok1.equals(code2)) 
			{
				System.out.print(white);
			} else if (gok1.equals(code3))
			{
				System.out.print(white);
			} else if (gok1.equals(code4))
			
			{
				System.out.print(white);
			} else {
				System.out.print("  ");
			}
			
			
			if (gok2.equals(code2)) 
			{
				System.out.print(" " + black);
			} else if (gok2.equals(code1)) 
			{
				System.out.print(" " + white);
			} else if (gok2.equals(code3)) 
			{
				System.out.print(" " + white);
			} else if (gok2.equals(code4)) 
			{
				System.out.print(" " + white);
			} else {
				System.out.print("  ");
			}

			
			if (gok3.equals(code3)) 
			{
				System.out.print(" " + black);
			} else if (gok3.equals(code1)) 
			{
				System.out.print(" " + white);
			} else if (gok3.equals(code2)) 
			{
				System.out.print(" " + white);
			} else if (gok3.equals(code4)) 
			{
				System.out.print(" " + white);
			} else {
				System.out.print("  ");
			}

			
			if (gok4.equals(code4)) 
			{
				System.out.print(" " + black);
			} else if (gok4.equals(code1)) 
			{
				System.out.print(" " + white);
			} else if (gok4.equals(code2)) 
			{
				System.out.print(" " + white);
			} else if (gok4.equals(code3)) 
			{
				System.out.print(" " + white);
			} else {
				System.out.print("  ");
			}

			
			System.out.println("");
			String allesgoed = gok1 + gok2 + gok3 + gok4;
			String code1234 = code1 + code2 + code3 + code4;
			if (code1234.equals(allesgoed)) 
			{
				System.out.println("Gongratulations ! ! !");
				break;
			}
			
			if (round>=10) {
				System.out.println("You lost ! ! !");
			}
		}
    }
}
