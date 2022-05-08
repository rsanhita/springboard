package com.samtech.shoprest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samtech.shoprest.model.User;
import com.samtech.shoprest.repository.UserRepository;

@Component

public class UserMngtService {

	/*
	 * private final UserRepository userRepository;
	 * 
	 * @Autowired public UserMngtService(UserRepository userRepository) {
	 * 
	 * this.userRepository = userRepository;
	 * 
	 * }
	 */

	public User addUser(User user) {

		//User saveduser = userRepository.save(user);

		return null;
	}

	/*
	 * public Iterable<User> retrieveUserList() {
	 * 
	 * // get the list of users from DB //Iterable<User> users =
	 * userRepository.findAll();
	 * 
	 * // users.forEach(t -> System.out.println()) {};
	 * 
	 * return users;
	 * 
	 * }
	 * 
	 * public Optional<User> findUserByID(long id) {
	 * 
	 * Optional<User> user = userRepository.findById(id);
	 * 
	 * return user; }
	 * 
	 * public void deleteUser(User user) {
	 * 
	 * userRepository.delete(user); }
	 */
}
