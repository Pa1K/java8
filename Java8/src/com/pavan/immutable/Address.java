package com.pavan.immutable;

// mutable class
public class Address {
	
	private String city;
	private String country;
	
	public Address(String city, String country) {
		
		this.city = city;
		this.country = country;
	}

	public Address(Address address) {
		this(address.getCity(), address.getCountry());
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;	
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
