package ca.ucalgary.ensf380;

public class Address {
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	//class constructor 
	public Address(String street, String city, String state, String postalCode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	//setters
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	//getters
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public boolean validate() {   // the body of this method was generated using AI but was modified for accurate results.
		return street != null && !street.isEmpty()
                && city != null && !city.isEmpty()
                && state != null && !state.isEmpty()
                && postalCode != null && !postalCode.isEmpty()
                && country != null && !country.isEmpty();
	}
	
	public String outputAsLabel() {  //this method returns the full address 
		return street + ", " + city + ", " + state + ", " + country + ", " +  postalCode;
	}
	
	
}
