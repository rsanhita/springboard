package com.samtech.shoprest.controller;

import com.samtech.shoprest.model.User;

public abstract class AbstractController {
	
	
	  public abstract User add();
	  
	  public abstract User retrieve();
	  
	  public abstract User update(User user);
	  
	  public abstract boolean delete(User user);
	  
	  public abstract Iterable<User> retrieveAll();
	  
	  
	  
	  public String run () {
		  
		  String result;
		  
		  result= "Hrdcoded";
		  
		  //return "Hrdcoded";

		  return result;

	  }
	 
	  
	
	
	

}