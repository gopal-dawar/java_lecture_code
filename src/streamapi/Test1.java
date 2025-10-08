package streamapi;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(11, 32, 42, 23, 57, 8, 88, 99, 129, 155);

		l.stream().filter(x -> x % 3 == 0).filter(x -> x % 2 == 0).forEach(x -> System.err.println(x));
		l.stream().filter(x -> x % 2 == 0).map(y -> y * 2).forEach(x -> System.out.println(x));

		l.stream().filter(x -> x <= 100).forEach(x -> System.out.println(x));

		Long count = l.stream().count();
		System.err.println("count is : " + count);

		Long oddcount = l.stream().filter(x -> x % 2 != 0).count();

		System.err.println("Odd count : " + oddcount);
	}
}
