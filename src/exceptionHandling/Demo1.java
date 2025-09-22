package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		try {
			demo1.printName();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void printName() throws FileNotFoundException {
		Demo1 demo1 = new Demo1();
		demo1.printValue();

	}

	public void printValue() throws FileNotFoundException {
		FileReader reader = new FileReader("abc.txt");

	}
}
