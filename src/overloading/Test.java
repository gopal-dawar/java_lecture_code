package overloading;

public class Test {
	public static void main(String[] args) {
		Calculation calculation = new Calculation(10, 20);
		calculation.addition(12, 23, 22);
		calculation.addition(12, 23);

	}
}
