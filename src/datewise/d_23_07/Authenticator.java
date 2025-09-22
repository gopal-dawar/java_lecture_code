package datewise.d_23_07;

import java.util.Scanner;

public class Authenticator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String correctUsername = "GopalDawar";
		String correctPasswrd = "12345";
		
		System.out.println("Enter user name : ");
		String username = s.next();
		
		 
		
		if (correctUsername.equals(username)) {
			System.out.println("Enter passwords : ");
			String password = s.next();
			if(correctPasswrd.equals(password)) {
				System.out.println("Login successful");
			}else {
				System.out.println("Wrong passwords");
			}
		}else {
			System.out.println("Wrong user name!");
		}
		
	}
}
