package functionalInterfacePreDefine;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test3 {
	public static void main(String[] args) {
		Consumer<String> s1 = (x) -> {

			System.out.println(x);
		};
		s1.accept("Hi Gopal");

//		==============================
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Consumer<List<Integer>> c1 = (x) -> {
			for (int a : x) {
				System.out.println(a);
			}
		};

		c1.accept(list);

	
		
	}

}
