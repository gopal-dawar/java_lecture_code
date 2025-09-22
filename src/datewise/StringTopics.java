package datewise;

import java.util.Scanner;

public class StringTopics {
	public static void main(String[] args) {
		// Example 1
		String name = "Gopal Dawar";

		for (int i = 0; i < name.length(); i++) {
			if ('a' == name.charAt(i) || 'i' == name.charAt(i) || 'o' == name.charAt(i) || 'u' == name.charAt(i)
					|| 'e' == name.charAt(i)) {
				System.out.println(name.charAt(i));
			}
		}

		// Example 2

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		String fname = sc.nextLine();

		System.out.println("Enter last name : ");
		String lname = sc.nextLine();

		System.out.println("Enter year of birth : ");
		int year = sc.nextInt();

		String username = "";

		username = username + lname.charAt(0);
		username = username + fname.charAt(0) + fname.charAt(1) + fname.charAt(2) + fname.charAt(3);
		username = username + year % 100;
		System.out.println(username);
	}
}
