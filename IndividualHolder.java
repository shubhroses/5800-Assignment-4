public class IndividualHolder extends Account {
	private String name;
	private String SSN;
	public IndividualHolder(int ID, AccountHolder address, String name, String SSN) {
		super(ID, address);
		this.name = name;
		this.SSN = SSN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
}
