package abstraction;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee : ");
		String name = sc.nextLine();

		Employee e;
		if (name.equalsIgnoreCase("manager")) {
			e = new Manager();
			e.printSalary(1000);
		} else {
			e = new HR();
			e.printSalary(1000);
		}
		
		
		
		
	}
}
