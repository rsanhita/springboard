package com.samtech.shoprest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "customers")
public class Customers {
	
	
	@Id
    @Column(name = " customer_id")
	private long customer_id;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "required_date")
	private String contact_name;
	
	@Column(name = "contact_title")
	private String contact_title;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "postal_code")
	private long postal_code;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "phone")
	private long phone;
	
	@Column(name = "fax")
	private long fax;
	
	
	public long getCustomer_id() {
		return customer_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public String getContact_name() {
		return contact_name;
	}
	public String getContact_title() {
		return contact_title;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getRegion() {
		return region;
	}
	public long getPostal_code() {
		return postal_code;
	}
	public String getCountry() {
		return country;
	}
	public long getPhone() {
		return phone;
	}
	public long getFax() {
		return fax;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public void setContact_title(String contact_title) {
		this.contact_title = contact_title;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setPostal_code(long postal_code) {
		this.postal_code = postal_code;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setFax(long fax) {
		this.fax = fax;
	}
	
	
}
