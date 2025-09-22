package has_relationsh_task3;

public class Vehical {

	private String name;
	private String type;
	
	private Registeration registeration;

	@Override
	public String toString() {
		return "\nVehical name : " + name + "\nType : " + type + "\nRegisteration -> " + registeration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Registeration getRegisteration() {
		return registeration;
	}

	public void setRegisteration(Registeration registeration) {
		this.registeration = registeration;
	}

}
