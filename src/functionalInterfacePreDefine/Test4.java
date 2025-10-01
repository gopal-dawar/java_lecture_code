package functionalInterfacePreDefine;

import java.util.function.Supplier;

public class Test4 {

	public static void main(String[] args) {
		Supplier<String> l = () -> {
			String name = "Gopal Dawar";
			return name;
		};

		System.out.println(l.get());
	}

}
