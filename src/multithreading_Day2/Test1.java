package multithreading_Day2;

public class Test1 {
	public static void main(String[] args) {

//		Demo d1 = new Demo();
//		d1.start();

		Runnable r1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Gopal Dawar");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
	}
}
