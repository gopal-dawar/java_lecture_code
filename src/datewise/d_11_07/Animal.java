package datewise.d_11_07;

import java.util.Scanner;

public class Animal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rollNo = sc.nextInt();
		
		System.out.println("Enter name : ");
		String name = sc.next();
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		Demo d = new Demo(rollNo,name, age);
		d.printInfo();
	}
}
