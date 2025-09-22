package datewise.d_17_07;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int no = s.nextInt();
		
		if(no%2 == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

} 
