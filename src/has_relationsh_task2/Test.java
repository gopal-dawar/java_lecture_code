package has_relationsh_task2;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Gopal Dawar");
		emp.setDepartment("Development");

		Experience exp = new Experience();
		exp.setCompanyName("Infosys");
		exp.setJobTitile("Java Full Stack Developer");
		exp.setDuration("3 Year");

		emp.setExperience(exp);

		System.out.println(emp.toString());

	}
}
