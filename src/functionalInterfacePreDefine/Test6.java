package functionalInterfacePreDefine;

import java.util.function.BiPredicate;

public class Test6 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> s1 = (x, y) -> {
			int ave = (x + y) / 2;
			return ave % 2 == 0;
		};

		System.out.println(s1.test(12, 15));
	}
}