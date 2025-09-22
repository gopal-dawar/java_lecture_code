package datewise.d_30_07;

public class LoopingExample {
	public static void main(String[] args) {
		//Ex. 1
		int a = 1;
		while(a <= 5) {
			System.out.println("while loop ");
			a++;
		}
		System.out.println("====================");
		
		// Ex. 2
		int b = 1;
		while(b <= 10) {
			if(b==5) {
				b++;
				continue;
			}
			System.out.println(b);
			b++;
		}
		
		System.out.println("=====================");
		// Ex. 3
		int c = 1;
		while(c <= 10) {
			if(c==5) {
				break;
			}
			System.out.println(c);
			c++;
		}
		
		System.out.println("=========do while loop ============");
		int d = 1;
		do {
			System.out.println(d);
			d++;
		}while(d <= 10);
		
	}
}
