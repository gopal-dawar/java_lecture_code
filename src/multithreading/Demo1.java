package multithreading;

public class Demo1 extends Thread {

	@Override
	public void run() {
		int a = 10 / 0;
		System.out.println(a);
	}

}
