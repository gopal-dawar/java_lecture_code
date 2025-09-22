package task;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("You can vote");
		}if (age < 18) {
			System.out.println("You can't be vote");
		}
	}
}
