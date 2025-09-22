package has_relationsh_task3;

public class Student {

	private String name;
	private int age;
	private long phoneNumber;
	
	private Vehical vehical;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	@Override
	public String toString() {
		return "Student name : " + name + "\nAge : " + age + "\nPhone Number : " + phoneNumber + "\nVehical -> " + vehical;
	}

}
