package com.samtech.shoprest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table ( name = "customers")
public class Customer {
	
	
	@Id
    @Column(name = " customer_id")
	private String customer_id;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "contact_name")
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
	private String postal_code;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "fax")
	private String fax;
	
	
	public String getCustomer_id() {
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
	public String getPostal_code() {
		return postal_code;
	}
	public String getCountry() {
		return country;
	}
	public String getPhone() {
		return phone;
	}
	public String getFax() {
		return fax;
	}
	public void setCustomer_id(String customer_id) {
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
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Customer [country= ");
		builder.append(country);
		builder.append(", customer_id=");
		builder.append(customer_id);
		builder.append(", company_name=");
		builder.append(company_name);
		builder.append(", contact_name=");
		builder.append(contact_name);
		builder.append(", contact_title=");
		builder.append(contact_title);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", region=");
		builder.append(region);
		builder.append(", postal_code=");
		builder.append(postal_code);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", fax=");
		builder.append(fax);
		builder.append("]");
		return builder.toString();
	}	
}
