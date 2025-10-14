package multithreading;

public class Test1 {
	public static void main(String[] args) {
//		Explain the exception handling in the senarios of thread

		Demo1 d = new Demo1();
		d.start();
		System.out.println("Start Code ");

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println("Code end here");
	}
}
