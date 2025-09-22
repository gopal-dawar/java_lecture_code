package exceptionHandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int value = sc.nextInt();

//		try {
//			int a = 20/value;
//			System.out.println(a);
//		}catch (ArithmeticException e) {
//			System.out.println("Can not be divide by zero");
//		}finally {
//			System.out.println("Thanks...");
//		}
		
		if (value != 0) {
			int a = 20/value;
			System.out.println(a);
		}else {
			System.out.println("Can not be divide by zero");
		}
		System.out.println("Thanks...");
		
	}
}
