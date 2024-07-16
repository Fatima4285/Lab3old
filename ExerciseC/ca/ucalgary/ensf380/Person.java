
public abstract class Person {
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber = 0; //just set a starting value of 0
	
	//constructors
	public Person(String name, String phoneNumber, String emailAddress, Address address) {
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		this.setEmailAddress(emailAddress);
		this.setAddress(address);
		lastPersonalNumber++; //increment lastPersonalNumber
	}
	
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	

	//getters
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public int getLastPersonalNumber() {
		return lastPersonalNumber;
	}
	
	//methods
	protected String nextPersonalNumber(short type) {
		//Help from chatgpt
        // Adjust the number based on 'type', here I'm just concatenating type and incremented last number
        lastPersonalNumber++; // Ensure it's incremented for each call
        return "PN" + type + "-" + lastPersonalNumber;
    }
	
	public boolean hasValidAddress() {
		if(this.address != null) {
			return true;
		}else {
			return false;
		}
	}
}
