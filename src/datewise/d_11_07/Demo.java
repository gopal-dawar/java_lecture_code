package datewise.d_11_07;

public class Demo {
	public int rollNo;
	public String name;
	public int age;
	
	public Demo(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("Roll Number : "+ rollNo);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
