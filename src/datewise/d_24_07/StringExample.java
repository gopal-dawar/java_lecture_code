package datewise.d_24_07;

public class StringExample {
	public static void main(String[] args) {
    //using literals
	//  SCP -> if value is same it wont repeat
		String name = "Gopal Dawar";
		String name1 = "Gopal Dawar";
		String address = "Pune";
		
		System.out.println(name.equals(name1));
		System.out.println(name == name1);
		System.out.println(name1 == address);
	//using new keyword
		
		String a = new String("gopal");
		String a1 = new String("gopal");
		String a2 = new String("Pune");
		
		System.err.println(a.equals(a1));
		System.out.println(a == a1);
		System.out.println(a1 == a2);
		
	}
}
