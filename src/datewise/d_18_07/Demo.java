package datewise.d_18_07;

public class Demo {
	public static void main(String[] args) {
		int maths = 49;
		int science = 60;
		int english = 70;
		int age = 18;
		int totalMarks = maths + science + english;
		
		
		if(age > 17){
			if(maths > 50) {
				if (science > 50) {
					if (english > 50) {
						if (totalMarks >= 160) {
							System.out.println("Eligible for admission");
						}else {
							System.out.println("Not eligible due to total marks less than 160");
						}
					}else {
						System.out.println("Not eligible for admission becouse english marks less 50");
					}
				}else {
					System.out.println("Not eligible for admission becouse science marks less 50");
				}
			}else {
				System.out.println("Not eligible for admission becouse maths marks less 50");
			}
			
		}else {
			System.out.println("Not eligible for admission");
			System.out.println("Age is less 17");
		}
	}
}
