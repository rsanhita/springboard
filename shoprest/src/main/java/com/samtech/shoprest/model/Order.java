package com.samtech.shoprest.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	
	
	@Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long order_id;
	
	@Column(name = "required_date")
	private Date	required_date;
	
	@Column(name = "shipped_date")
	private Date	shipped_date;
	
	@Column(name = "ship_via")
	private int	ship_via;
	
	@Column(name = "freight")
	private String	freight;
	
	
	//private long	order_id;
	@Column(name = "customer_id")
	private String	customer_id;
	
	@Column(name = "order_date")
	private Date	order_date;
	
	@Column(name = "employee_id")
	private int	employee_id;
	//private Date	order_date;
	//private character	customer_id;
	@Column(name = "ship_name")
	private String	ship_name;
	
	@Column(name = "ship_address")
	private String	ship_address;
	
	@Column(name = "ship_city")
	private String	ship_city;
	
	@Column(name = "ship_region")
	private String	ship_region;
	
	@Column(name = "ship_postal_code")
	private String	ship_postal_code;
	
	
	public long getOrder_id() {
		return order_id;
	}
	public Date getRequired_date() {
		return required_date;
	}
	public Date getShipped_date() {
		return shipped_date;
	}
	public int getShip_via() {
		return ship_via;
	}
	public String getFreight() {
		return freight;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public String getShip_name() {
		return ship_name;
	}
	public String getShip_address() {
		return ship_address;
	}
	public String getShip_city() {
		return ship_city;
	}
	public String getShip_region() {
		return ship_region;
	}
	public String getShip_postal_code() {
		return ship_postal_code;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public void setRequired_date(Date required_date) {
		this.required_date = required_date;
	}
	public void setShipped_date(Date shipped_date) {
		this.shipped_date = shipped_date;
	}
	public void setShip_via(int ship_via) {
		this.ship_via = ship_via;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}
	public void setShip_address(String ship_address) {
		this.ship_address = ship_address;
	}
	public void setShip_city(String ship_city) {
		this.ship_city = ship_city;
	}
	public void setShip_region(String ship_region) {
		this.ship_region = ship_region;
	}
	public void setShip_postal_code(String ship_postal_code) {
		this.ship_postal_code = ship_postal_code;
	}
	
	
	

}
