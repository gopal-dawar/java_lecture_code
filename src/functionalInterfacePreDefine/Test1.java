package functionalInterfacePreDefine;

import java.util.function.Predicate;

public interface Test1 {

	public static void main(String[] args) {
		Predicate<Integer> f = x -> x % 2 == 0;
		boolean b = f.test(25);
		System.out.println(b);

		Predicate<String> name = x -> x.startsWith("G");
		System.out.println(name.test("Gopal"));

//		 		

	}
}
