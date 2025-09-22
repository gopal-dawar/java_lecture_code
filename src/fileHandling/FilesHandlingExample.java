package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesHandlingExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();

		System.out.println("Enter age : ");
		String age = sc.nextLine();

		File file = new File("D:\\java\\Files\\" + "Data1.xlsx");

		try {
			if (file.createNewFile()) {
				System.out.println("File Created!");
			} else {
				System.out.println("File already have!");
			}

			FileWriter writer = new FileWriter(file, true);
			writer.write(name);
			writer.write(age);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
