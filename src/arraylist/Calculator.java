package arraylist;

public class Calculator {
	public int add(int x, int y) {
		return x + y;
	}

	// This method could throw an ArithmeticException
	public double divide(int x, int y) {
		try {
			return x / y;
		} catch (Exception divide) {
			y = 1;
			return x / y;

		}
	}
}
