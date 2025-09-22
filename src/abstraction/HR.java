package abstraction;

public class HR extends Employee {

	@Override
	public void printSalary(int a) {
		a = a + 12000;
		System.out.println("HR salary :" + a);
	}

	
}
