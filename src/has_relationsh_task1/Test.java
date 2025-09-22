package has_relationsh_task1;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(101);
		s.setCity("Pune");
		s.setName("Gopal");

		Degree d = new Degree();
		d.setDegreeName("B.Sc");
		d.setFieldofStudy("Computer Science");
		d.setUniversity("North Maharashtra University");
		d.setDuration("2 Year");

		s.setDegree(d);

		
		
		
		System.out.println(s.toString());

	}
}
