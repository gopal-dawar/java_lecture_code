package abstraction;

public class Manager extends Employee {

	@Override
	public void printSalary(int a) {
		a = a + 10000;
		System.out.println("Manager salary : " + a);
	}

}
