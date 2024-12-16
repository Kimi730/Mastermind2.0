package arraylist;

import java.util.Scanner;

public class farenHeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Enter a number of Fahrenheit";
		System.out.println(text);
		CalculatorFarenheit calc = new CalculatorFarenheit();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		calc.berekenFnaarC(input);
		input = sc.nextInt();
		calc.berekenFnaarK(input);
		sc.close();
	}

}
