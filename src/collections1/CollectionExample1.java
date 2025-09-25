package collections1;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample1 {
	public static void main(String[] args) {
		List<Integer> evenNumber = new ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				evenNumber.add(i);
			}
		}

		for (int n : evenNumber) {
			System.out.print(n + " ");
		}
	}
}
