package Que1;

public class Address {
	private String Street;
	private String state;
	private String city;
	private int zip;
	private String country;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String street, String state, String city, int zip, String country) {
		super();
		Street = street;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}
	

}
