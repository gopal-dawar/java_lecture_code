package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesHandlingExample1 {
	public static void main(String[] args) {
		File file = new File("D:\\java\\Files\\studentdetails.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}
