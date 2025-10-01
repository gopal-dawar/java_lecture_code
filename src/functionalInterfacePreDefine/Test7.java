package functionalInterfacePreDefine;

import java.util.function.BiPredicate;

public class Test7 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> m1 = (x, y) -> {
			int mul = x * y;
			return x % 2 == 0;
		};
	}
}
