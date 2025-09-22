package fileHandling_task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		String id = sc.nextLine();

		System.out.println("Enter First Name : ");
		String fname = sc.nextLine();

		System.out.println("Enter last name : ");
		String lname = sc.nextLine();

		System.out.println("Enter phone number : ");
		String phoneNumber = sc.nextLine();

		System.out.println("Enter city name : ");
		String city = sc.nextLine();

		File file = new File("D:\\java\\Files\\" + "studentdetails.txt");

		try {
			if (file.createNewFile()) {
				System.out.println("File Created!");
			} else {
				System.out.println("File already Exist!");
			}
			FileWriter writer = new FileWriter(file, true);
			writer.write(id + " : ");
			writer.write(fname + " : ");
			writer.write(lname + " : ");
			writer.write(phoneNumber + " : ");
			writer.write(city + System.lineSeparator());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		System.out.println("You want to print data (y/n) : ");
		char ch = sc.next().charAt(0);

		if (ch == 'y' || ch == 'Y') {
			Scanner printData;
			try {
				printData = new Scanner(file);
				while (printData.hasNextLine()) {
					String lines = printData.nextLine();
					System.out.println(lines);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Thanks...");
		}

	}
}
