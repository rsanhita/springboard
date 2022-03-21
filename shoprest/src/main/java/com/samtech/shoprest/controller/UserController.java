package com.samtech.shoprest.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samtech.shoprest.model.User;
import com.samtech.shoprest.repository.UserRepository;
import com.samtech.shoprest.service.UserMgmtService;

@Controller
public class UserController {
	
	//TODO excellent example of final
	private final UserMgmtService userMgmtService;
	
	//TODO - Through Autowire we are creating objects
    @Autowired
    public UserController(UserMgmtService userMgmtService) {
        this.userMgmtService = userMgmtService;
    }
    
    
    @GetMapping("/index")
    public String showUserList(Model model) {
    	
    	 	
    	//get the list of users from DB
    	Iterable<User> users = userMgmtService.retrieveUserList();
    	
    	//set the list of users in Model
        model.addAttribute("users", users);
        
        //redirect to the intended page 
        return "index";
    }
    
    @GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "add-user";
    }
    
    @PostMapping("/adduser")
    public String addUser(@Validated User user, BindingResult result, Model model) {
    	
        if (result.hasErrors()) {
            return "add-user";
        }
        
        User savedUser = userMgmtService.addUser(user);
        
        //userRepository.save(user);
        return "redirect:/index";
    }
    
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
    	
        //User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

    	//retrieve the user from DB if it exists
        Optional<User> user = userMgmtService.findUserByID(id);          
        if(user.isEmpty()) {
        	throw new IllegalArgumentException("Invalid user Id:" + id);
        }
        
        
        //set the user in the model
        model.addAttribute("user", user);
        
        return "update-user";
    }
    
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Validated User user, BindingResult result, Model model) {
    	
        if (result.hasErrors()) {
            user.setId(id);
            return "update-user";
        }
        
        userMgmtService.addUser(user);

        return "redirect:/index";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        //User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    	//retrieve the user from DB if it exists
        
    	
    	Optional<User> user = userMgmtService.findUserByID(id);          
        if(user.isEmpty()) {
        	throw new IllegalArgumentException("Invalid user Id:" + id);
        } else {

            //userRepository.delete(user);
            userMgmtService.deleteUser(user.get());
        }
        
        
        return "redirect:/index";
    }
    
}
