package datewise.d_17_07;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int no = s.nextInt();
		
		Fact f = new Fact();
		System.out.println("Factorial of " + no + " is : " + f.fact(no));
		
	}
	
	public int fact(int no) {
		if(no == 0 || no == 1) 
			return 1;
		if (no > 1) {
			return no * fact(no - 1);
		}
		return 1;	
	}
}
