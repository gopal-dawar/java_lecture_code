package has_relationsh_task3;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Gopal Dawar");
		s.setPhoneNumber(9876543210L);
		s.setAge(22);

		Vehical v = new Vehical();
		v.setName("Honda City");
		v.setType("Car");

		s.setVehical(v);

		Registeration r = new Registeration();
		r.setManufacturingYear(2022);
		r.setVehicalNo("MH-18-AB-1234");
		v.setRegisteration(r);

		System.out.println(s.toString());
	}
}
