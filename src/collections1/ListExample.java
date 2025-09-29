package collections1;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

//		1. print list using loop
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(6);
		l1.add(7);

		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
		System.out.println();
//		2. print in reverse order 
		for (int i = l1.size() - 1; i >= 0; i--) {
			System.out.print(l1.get(i) + " ");
		}

//		3. print sum of number in list 
		System.out.println();
		int sum = 0;
		for (int i = 0; i < l1.size(); i++) {
			sum = sum + l1.get(i);
		}
		System.out.println("sum of list : " + sum);
//		4. count how many even numbers in list
		int count = 0;
		for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i) % 2 == 0) {
				count++;
			}
		}
		System.out.println("Even numbers in list : " + count);

//		5. find the maximum and minimum number in list
		int max = l1.get(0);
		int min = l1.get(0);
		for (int i = 0; i < l1.size(); i++) {
			if (max < l1.get(i)) {
				max = l1.get(i);
			}
			if (min > l1.get(i)) {
				min = l1.get(i);
			}
		}
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);

//		6. count how many time given elements are appears in the list
		int appears = 0;
		boolean[] visited = new boolean[l1.size()];
		for (int i = 0; i < l1.size(); i++) {
			if (visited[i]) {
				continue;				
			}
			appears = 1;
			for (int j = i + 1; j < l1.size(); j++) {
				if (l1.get(i) == l1.get(j)) {
					visited[j] = true;
					appears++;
				}
			}
			System.out.println(l1.get(i) + " is appears : " + appears + " times");
		}
		
		
//		
	}
}
