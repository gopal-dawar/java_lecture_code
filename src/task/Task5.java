package task;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = m.nextInt();
		
		Task5 d = new Task5();
		d.printMarks(marks);
		
	}
	
	
	public void printMarks(int marks) {
		
		if (marks <= 100 && marks >= 80) {
			if(marks <= 100 && marks >= 90) {
				System.out.println("A+ Grade");
			}else if (marks <= 89 && marks >= 80) {
				System.out.println("A Grade");
			}
		}
		else if (marks <= 79 && marks >= 60) {
			if (marks <= 79 && marks >= 70) {
				System.out.println("B+ Grade");
			}else if (marks <= 69 && marks >= 60) {
				System.out.println("B Grade");
			}			
		}
		else if (marks <= 59 && marks >= 50) {
			System.out.println("Passed");
		}else if(marks <= 49 && marks >= 0) {
			System.out.println("Failed");
		}
	}
}
