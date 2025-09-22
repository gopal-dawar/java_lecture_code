package task;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = s.nextInt();
		
		if(marks >= 90 && marks <= 100) {
			System.out.println("A Grade");
		}else if(marks >= 70 && marks <= 89) {
			System.out.println("B Grade");
		}else if (marks >= 35 && marks <= 69) {
			System.out.println("C Grade");
		}else if (marks <= 34 && marks >= 0) {
			System.out.println("Fails");
		}else {
			System.out.println("Wrong marks");
		}
	}
}
