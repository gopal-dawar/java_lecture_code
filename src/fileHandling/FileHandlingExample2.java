package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample2 {
	public static void main(String[] args) {
		String filePath = "D:\\java\\Files\\studentdetails.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Homework -> student details file
		// read data from studentdetails txt and print it as a object
		// convert every line from txt to student object
		//then print student object using tostring or getter
	}
}
