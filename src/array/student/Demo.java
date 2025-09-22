package array.student;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Gopal");
		s1.setCity("Pune");
		s1.setAge(21);

		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Chetan");
		s2.setCity("Mumbai");
		s2.setAge(15);

		Student s3 = new Student();
		s3.setId(103);
		s3.setName("Nakul");
		s3.setCity("Dhule");
		s3.setAge(19);

		Student s4 = new Student();
		s4.setId(104);
		s4.setName("Nilesh");
		s4.setCity("Banglore");
		s4.setAge(20);

		Student[] studentArray = { s1, s2, s3, s4 };

//		for (int i = 0; i < studentArray.length; i++) {
//			System.out.println(studentArray[i]);
//		}
//		System.out.println("Find Student using city : ");
//		String city = sc.nextLine();

		
		
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getAge() >= 18) {
				System.out.println("Student id : " + studentArray[i].getId());
				System.out.println("Student name : " + studentArray[i].getName());
				System.out.println("City : " + studentArray[i].getCity());
				System.out.println("Age : " + studentArray[i].getAge());
				System.out.println();
			}
		}

	}
}
