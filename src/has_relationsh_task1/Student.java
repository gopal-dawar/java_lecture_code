package has_relationsh_task1;

public class Student {
	private int id;
	private String name;
	private String city;
	private Degree degree;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student id : " + id + "\nname : " + name + "\ncity : " + city + "\nDegrees -> " + degree;
	}

}
