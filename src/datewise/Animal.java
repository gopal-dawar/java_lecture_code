package datewise;

public class Animal {
	static int age = 22;
	
	static {
		System.out.println("Hey Gopal");
	}
	public void printName() {
		System.out.println("Tiger");
	}
	
	static {
		System.out.println("End block");
	}
}
