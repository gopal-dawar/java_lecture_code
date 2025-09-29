package functionalInterface;

public class AdditionImpl {

	public static void main(String[] args) {
		FIAddition f = (a, b) -> {
			System.out.println(a + b);
		};
		
//		() -> {} ==> lambda expression
		
		f.addition(12, 23);
	}

//	@Override
//	public void addition(int a, int b) {
//		System.out.println(a + b);
//
//	}

}
