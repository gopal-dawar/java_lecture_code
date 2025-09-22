package overloading;

//Overloading -> Compile time polymorphism 
public class Calculation {

	// constructor -> constructor also can be overload but different parameters
	public Calculation() {
		System.out.println("Default constructor");
	}

	public Calculation(int a, int b) {
		this();
		int sum = a + b;
		System.out.println("Sum using constructor : " + sum);
	}

	// methods -> Methods can be overload with different parameters and squences of
	// parameter in paranthesis and also overload static methods 
	// Example 1
	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two number : " + sum);
	}

	public void addition(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum of three number : " + sum);
	}

	// Example 2 -> method overloading sequence of parameters changed
	static void printSomething(String name, int id) {

	}

	static void printSomething(int id, String name) {

	}

	// static method
}

// you can overload only methods , constructor and also static method but sequenc of parameter and number of parameter 

// variable can not be overload because they have fixed value that's why can be overload 