package interfaces2;

public class Child implements Animal, Lion {

	@Override
	public void printName() {
		System.out.println("Animal");
	}

	@Override
	public void printValue() {
		System.out.println("Lion");
	}
	
	
}
