package functionalInterface;

public class CalculatorImpl {

	public static void main(String[] args) {
		FICalculator substraction = (a, b) -> {
			System.out.println(a - b);
		};

		substraction.operation(12, 6);
		FICalculator addition = (a, b) -> {
			System.out.println(a + b);
		};

		addition.operation(12, 12);
		FICalculator multiplication = (a, b) -> {
			System.out.println(a * b);
		};

		multiplication.operation(2, 5);

		FICalculator division = (a, b) -> {
			System.out.println(a / b);
		};

		division.operation(12, 2);

	}
}
