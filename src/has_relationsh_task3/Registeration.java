package has_relationsh_task3;

public class Registeration {
	private String vehicalNo;
	private int manufacturingYear;

	public String getVehicalNo() {
		return vehicalNo;
	}

	public void setVehicalNo(String vehicalNo) {
		this.vehicalNo = vehicalNo;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	@Override
	public String toString() {
		return "\nRegisteration Vehical No : " + vehicalNo + "\nManufacturingYear : " + manufacturingYear;
	}

}
