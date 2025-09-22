package has_relations;

public class Test {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(101);
		s.setCity("Pune");
		s.setName("Gopal");

		PersonalDetails p = new PersonalDetails();
		p.setFatherName("ABC");
		p.setMotherName("XYZ");

		s.setDetails(p);

		System.out.println(s.getId());
		System.out.println(s.getCity());
		System.out.println(s.getName());
		
		System.out.println(s.getDetails().getFatherName());
		System.out.println(s.getDetails().getMotherName());
		
	}
}
