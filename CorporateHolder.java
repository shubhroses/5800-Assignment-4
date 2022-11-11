public class CorporateHolder extends Account {
	private String contact;
	public CorporateHolder (int ID, AccountHolder address, String contact) {
		super(ID, address);
		this.contact = contact;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
