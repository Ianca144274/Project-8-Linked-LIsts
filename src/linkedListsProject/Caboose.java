package linkedListsProject;

public class Caboose {
	private String name;
	private String cargo;
	private Caboose nextCaboose;
	
	public Caboose(String name, String cargo) {
		this.name = name;
		this.cargo = cargo;
		this.nextCaboose = null;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Caboose getNextCaboose() {
		return nextCaboose;
	}
	public void setNextCaboose(Caboose nextCaboose) {
		this.nextCaboose = nextCaboose;
	}
	
	public boolean hasNextCaboose() {
		return !(nextCaboose == null);
	}
}
