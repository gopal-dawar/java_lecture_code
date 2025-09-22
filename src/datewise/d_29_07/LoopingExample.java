 package datewise.d_29_07;

public class LoopingExample {
	public static void main(String[] args) {
		for(int a = 1;a <= 5;a++) {
			System.out.println(a);
		}
		
		System.out.println("=================");
		
		for(int b = 5; b >=1;b--) {
			System.out.println(b);
		}
		
		System.out.println("=================");
		
		for(int c = 1  ; c <= 10;c++) {
			int num = c * 3;
			if(num%2 == 0) {
				System.out.println(num);
			}
		}
	}

}
