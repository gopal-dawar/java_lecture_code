package Overriding;

public class Lion extends Animal {
	public int a = 100;
	
	

	public Lion() {
		this(10);
		System.out.println("Default Constructor ");
	}

	public Lion(int a) {
		System.out.println("Parameter Constructor : " + a);
	}

	public void printColor() {
		System.out.println("Print Color");
	}

	public void printSomething() {
		System.out.println("Print Something");
		System.out.println(this.a);
		this.printColor();
//		this.printName();
	}

	@Override
	public void printName(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Print Name Lion");
	}
	
	public void printName(int a, int b, int c) {
	//	super.printName(a, b);
		System.out.println("Print Name Lion");
	}
	
	

}
