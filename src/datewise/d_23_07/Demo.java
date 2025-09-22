package datewise.d_23_07;

public class Demo {
	public static void main(String[] args) {
		String s = "Gopal Dawar";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		char c = s.charAt(1);
		System.out.println(c);
		
		System.out.println(s.concat(" ...."));
		System.out.println(s.endsWith("r"));
		System.out.println(s.startsWith("g"));
		int i = s.indexOf("D");
		System.out.println(i);
		System.out.println(s.contains("Dawar"));
		System.out.println(s.isEmpty());
		
		
	}
}
