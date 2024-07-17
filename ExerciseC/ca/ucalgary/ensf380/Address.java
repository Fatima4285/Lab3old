package ca.ucalgary.ensf380;

class Address {
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
	
	public String validate() {
        if (street == null || street.isEmpty()) {
            return "Street address is missing.";
        }
        if (city == null || city.isEmpty()) {
            return "City is missing.";
        }
        if (state == null || state.isEmpty()) {
            return "State is missing.";
        }
        if (postalCode == null || postalCode.isEmpty()) {
            return "Postal code is missing.";
        }
        if (country == null || country.isEmpty()) {
            return "Country is missing.";
        }
        return "Address is valid.\n";

    }
	
	public String outputAsLabel() {  //this method returns the full address 
		return street + ", " + city + ", " + state + ", " + country + ", " +  postalCode;
	}

}
