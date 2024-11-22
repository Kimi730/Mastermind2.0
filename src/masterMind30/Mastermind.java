package masterMind30;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Mastermind,Pick four colors,You have 10 chances");
		System.out.println("If you get a X, it means you have it at the right place, if its W, it means it is at the wrong place and none of both means it doesn't exist.");
		System.out.println("Turn on caps lock, this will be handy, type in one line with spaces");
		System.out.println("Pickable colors: R,Y,G,B,P");
		
        String[] colors = {"R","Y","G","B","P","O"};
		
        String[] checks = {"X","W"};
        
        String[] codes = {colors[5],colors[4],colors[3],colors[0]};
        
		Scanner sc = new Scanner(System.in);
		
        String[] gokken = new String[4];

		
		for (int round = 1; round <= 10; round++) {

			System.out.println("");
			
			System.out.println("Round " + round);
		
			gokken[0] = sc.next();
			gokken[1] = sc.next();
			gokken[2]= sc.next();
			gokken[3] = sc.next();

			
			if (gokken[0].equals(codes[0])) 
			{
				System.out.print(checks[0]);
			} else if (gokken[0].equals(codes[1])) 
			{
				System.out.print(checks[1]);
			} else if (gokken[0].equals(codes[2]))
			{
				System.out.print(checks[1]);
			} else if (gokken[0].equals(codes[3]))
			
			{
				System.out.print(checks[1]);
			} else {
				System.out.print("  ");
			}
			
			
			if (gokken[1].equals(codes[1])) 
			{
				System.out.print(" " + checks[0]);
			} else if (gokken[1].equals(codes[0])) 
			{
				System.out.print(" " + checks[1]);
			} else if (gokken[1].equals(codes[2])) 
			{
				System.out.print(" " + checks[1]);
			} else if (gokken[1].equals(codes[3])) 
			{
				System.out.print(" " + checks[1]);
			} else {
				System.out.print("  ");
			}

			
			if (gokken[2].equals(codes[2])) 
			{
				System.out.print(" " + checks[0]);
			} else if (gokken[2].equals(codes[0])) 
			{
				System.out.print(" " + checks[1]);
			} else if (gokken[2].equals(codes[1])) 
			{
				System.out.print(" " + checks[1]);
			} else if (gokken[2].equals(codes[3])) 
			{
				System.out.print(" " + checks[1]);
			} else {
				System.out.print("  ");
			}

			
			if (gokken[3].equals(codes[3])) 
			{
				System.out.print(" " + checks[0]);
			} else if (gokken[3].equals(codes[0])) 
			{
				System.out.print(" " + checks[1]);
			} else if (gokken[3].equals(codes[1])) 
			{
				System.out.print(" " + checks[1]);
			} else if (gokken[3].equals(codes[2])) 
			{
				System.out.print(" " + checks[1]);
			} else {
				System.out.print("  ");
			}

			
			System.out.println("");
			String allesgoed = gokken[0] + gokken[1] + gokken[2] + gokken[3];
			String code1234 = codes[0] + codes[1] + codes[2] + codes[3];
			if (code1234.equals(allesgoed)) 
			{
				System.out.println("Gongratulations ! ! !");
				break;
			}
			
			if (round>=10) {
				System.out.println("You lost ! ! !");
				 sc.close();
			}
		}
    }
}
