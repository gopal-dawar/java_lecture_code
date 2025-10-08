package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 99);

		l.stream().filter(x -> x % 3 == 0).forEach(x -> System.out.println(x));

		Long count = l.stream().filter(x -> x < 7).count();

		System.out.println("Count : " + count);

		List<Integer> la = l.stream().map(x -> x * 10).collect(Collectors.toList());

		System.out.println(la.toString());

	}
}
