package has_relationsh_task2;

public class Employee {
	private int empId;
	private String empName;
	private String department;
	private Experience experience;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee Id : " + empId + "\nempName : " + empName + "\nDepartment : " + department + "\nExperience -> "
				+ experience;
	}

}
