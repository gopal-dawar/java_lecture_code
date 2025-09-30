package functionalInterfacePreDefine;

import java.util.function.Function;

public class Test2 {
	public static void main(String[] args) {
		Function<Integer, Integer> square = x -> x * x;
		Integer a = square.apply(5);
		System.out.println(a);

		Function<String, Integer> count = x -> x.length();

		Integer a1 = count.apply("Gopal");
		System.out.println(a1);

	}
}
