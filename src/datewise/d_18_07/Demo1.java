package datewise.d_18_07;

public class Demo1 {
	public static void main(String[] args) {
		int maths = 51;
		int science = 60;
		int english = 60;
		int age = 19;
				
		int totalMarks = (maths + science + english) / 3;
		
		if(age > 17){
			if(maths > 50 && science > 50 && english > 50) {
				if (totalMarks >= 60) {
					System.out.println("Eligible for admission");
				}else {
					System.out.println("Not eligible due to total percentage less than 60");
				}
			}else {
					if(maths < 50) {
						System.out.println("Not eligible for admission becouse maths marks less 50");
					}
					if (science < 50) {
						System.out.println("Not eligible for admission becouse science marks less 50");
					}
					if (english < 50) {
						System.out.println("Not eligible for admission becouse english marks less 50");
					}
					
				}
			}else {
			System.out.println("Not eligible for admission");
			System.out.println("Age is less 17");
		}
	}
}
