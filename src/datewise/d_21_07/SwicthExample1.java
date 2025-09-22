package datewise.d_21_07;

import java.util.Scanner;

public class SwicthExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days : ");
		String week = sc.next();
		
		String input = week.toLowerCase();
		
 		switch (input) {
		case "monday": {
			System.out.println(1);
			break;
		}
		case "tuseday": {
			System.out.println(2);
			break;
		}
		case "wednesday": {
			System.out.println(3);
			break;
		}
		case "thursday": {
			System.out.println(4);
			break;
		}
		case "friday": {
			System.out.println(5);
			break;
		}
		case "satarday": {
			System.out.println(6);
			break;
		}
		case "sunday": {
			System.out.println(7);
			break;
		}
		default:
			System.out.println("Invalid Input");
		}
 	}
}
