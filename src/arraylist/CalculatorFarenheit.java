package arraylist;

public class CalculatorFarenheit {

	public int vijf = 5;
	public int negen = 9;
	public int tweeendertig = 32;

	public double berekenFnaarC(int input) {
		double celsius = (input - tweeendertig) * vijf / negen;
		System.out.println(input + " in Celsius is " + celsius);
		return celsius;
	}

	public double berekenFnaarK(int input) {

		double kelvin = ((input - tweeendertig) / 1.8) + 273.15;
		System.out.println(input + " In Kelvin is " + kelvin);
		return kelvin;
	}
}
