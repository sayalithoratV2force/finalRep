package com.example.demo;

public class Property 
{

	private Integer apt;
	private Integer property_id;
	
	private String city;
	private String state;
	private Integer zip;
	private String property_type;
	private Integer bedrooms;
	private Integer baths;
	
	private String street_address;
	
	public Integer getProperty_id() {
		return property_id;
	}
	public void setProperty_id(Integer property_id) {
		this.property_id = property_id;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public Integer getApt() {
		return apt;
	}
	public void setApt(Integer apt) {
		this.apt = apt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String getProperty_type() {
		return property_type;
	}
	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}
	public Integer getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}
	public Integer getBaths() {
		return baths;
	}
	public void setBaths(Integer baths) {
		this.baths = baths;
	}
	@Override
	public String toString() {
		return "Property [apt=" + apt + ", city=" + city + ", state=" + state + ", zip=" + zip + ", property_type="
				+ property_type + ", bedrooms=" + bedrooms + ", baths=" + baths + ", street_address=" + street_address
				+ "]";
	}
}
