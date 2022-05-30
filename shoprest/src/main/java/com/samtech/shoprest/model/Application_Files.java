package com.samtech.shoprest.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application_files")

public class Application_Files {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private  int Id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "Start_date")
	private LocalDate Start_date;
	
	@Column(name = "end_date")
	private LocalDate end_date;
	
	@Column(name = "submit_time")
	private LocalDateTime submit_time;

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public LocalDate getStart_date() {
		return Start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public LocalDateTime getSubmit_time() {
		return submit_time;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStart_date(LocalDate start_date) {
		Start_date = start_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public void setSubmit_time(LocalDateTime submit_time) {
		this.submit_time = submit_time;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
