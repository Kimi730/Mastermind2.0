package arraylist;

public class MaxIntegers {

	public static void main(String[] args) {
		int num1 = 2, num2 = 1, num3 = 3;
		int max = num1;

		if (num2 > max) {
			max = num2;
		} else if (num3 > max) {
			max = num3;
		}

		System.out.println("The max of 3 numbers is " + max);
		
	}

}