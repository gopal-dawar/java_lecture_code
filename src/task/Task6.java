package task;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		Task6 t = new Task6();
		t.Atm();
		
	}
	public void Atm() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. add amount");
		System.out.println("2. Widthrowal");
		System.out.println("Enter your choice : ");
		int choice = s.nextInt();
		
		int balence = 1000;
		
		if(choice == 1) {
			System.out.println("Enter amount : ");
			int amount = s.nextInt();
			balence = balence + amount;
			System.out.println("Amount Added");
			System.out.println("Total amount : " + balence);
		}else if(choice == 2){
			System.out.println("Enter amount : ");
			int amount = s.nextInt();
			balence = balence - amount;
			if (amount%100 == 0) {
				System.out.println("Widthrowal amount : " + amount);
				System.out.println("Total amount : " + balence);
			}else {
				System.out.println("Reject");
				System.out.println("Enter amount multiple of 100");
			}
		}		
	}
}	
