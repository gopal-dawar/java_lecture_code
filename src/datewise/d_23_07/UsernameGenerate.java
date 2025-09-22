package datewise.d_23_07;

import java.util.Scanner;

public class UsernameGenerate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = s.next();
		
		System.out.println("Enter your DOB year : ");
		int year = s.nextInt();
		
		int lastTwoDigit = year % 100;
		int firstTwoDigit = year / 100;
		
		if(lastTwoDigit <= 0){
			System.out.println(name + firstTwoDigit);
		}else{
			if(lastTwoDigit <= 9){
				System.out.println(name + "0"+lastTwoDigit);
			}else{
			System.out.println(name + lastTwoDigit);	
			}
		}
	}
}
