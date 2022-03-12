package com.samtech.shoprest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samtech.shoprest.model.User;
import com.samtech.shoprest.repository.UserRepository;

@Controller
public class UserController {
	
	//TODO excellenet example of final
	private final UserRepository userRepository;
	
	//TODO - Through Autowire we are creating objects
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    @GetMapping("/index")
    public String showUserList(Model model) {
        model.addAttribute("users", userRepository.findAll());
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
        
        userRepository.save(user);
        return "redirect:/index";
    }
    
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        model.addAttribute("user", user);
        
        return "update-user";
    }
    
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id, @Validated User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            user.setId(id);
            return "update-user";
        }
        
        userRepository.save(user);

        return "redirect:/index";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        userRepository.delete(user);
        
        return "redirect:/index";
    }
    // additional CRUD methods
    
    
    //TODO - Good example of annotation
    @SuppressWarnings("unused")
	private List<User> getDummyUsers () {
    	
    	User user1 = new User();
    	user1.setEmail("email1@dummyemail.com");
    	user1.setId(1);
    	user1.setName("User1 Name");
    	
    	User user2 = new User();
    	user2.setEmail("email2@gmail.com");
    	user2.setId(2);
    	user2.setName("User2");
    	
    	User user3 = new User();
    	user3.setEmail("email3@gmail.com");
    	user3.setId(3);
    	user3.setName("User3");
    	
    	List<User> users = new ArrayList<User>();
    	users.add(user1);
    	users.add(user2);
    	users.add(user3);
    	
    	return users;
    }
}
