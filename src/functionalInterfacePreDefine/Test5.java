package functionalInterfacePreDefine;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test5 {
	public static void main(String[] args) {
		Predicate<Integer> check = x -> x % 2 == 0;

		Function<Integer, Integer> square = x -> x * x;

		Consumer<Integer> print = x -> System.out.println(x);

		Supplier<Integer> returnvalue = () -> 6;

		if (check.test(returnvalue.get())) {
			print.accept(square.apply(returnvalue.get()));
		} else {
			System.out.println("Not even ");
		}
	}

}
