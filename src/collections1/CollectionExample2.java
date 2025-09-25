package collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(23);
		list.add(23);

		System.out.println(list.toString());

//		auto increase after list1 is full 
		List<Integer> list1 = new ArrayList<Integer>(100);
		list1.add(21);
		list1.add(23);
		list1.add(23);

		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		Integer[] array = { 1, 2, 4, 6, 7, 9 };

		List<Integer> list3 = Arrays.asList(array);

//		list3.add(2132);
		 
		System.out.println(list3.toString());

	}
}
