package com.samtech.shoprest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samtech.shoprest.model.User;
import com.samtech.shoprest.repository.UserRepository;

@Component
public class UserMgmtService {
	
	
	//TODO excellenet example of final
	private final UserRepository userRepository;
	
	//TODO - Through Autowire we are creating objects
    @Autowired
    public UserMgmtService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
 public User addUser (User user) {
	 
	 		
	 User saveduser =userRepository.save(user);
	 
	 return saveduser;
	}
	

 public Iterable<User> retrieveUserList () {
	 
		
		  //get the list of users from DB 
	 Iterable<User> users =userRepository.findAll();
	 
		  
		  return users;
		 
 
 }
 
 public Optional<User> findUserByID (long id) {
	 
	 Optional<User> user= userRepository.findById(id);
	 
	 return user;
 }

 
 public void deleteUser (User user) {
	 
	 userRepository.delete(user);
 }
}
