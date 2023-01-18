package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
private UserService userService;
//Getting the data
@GetMapping("/user")
public List<User1> getUser(){
	return this.userService.getUser();
}
//save the data
@PostMapping("/user")
public User1 saveUser(@RequestBody User1 user){
	return this.userService.saveUser(user);
}
//update the data
@PutMapping("/user")
public User1 updateUser(@RequestBody User1 user){
	return this.userService.updateUser(user);
}
//delete the data
@DeleteMapping("/user/{userId}")
public void deleteUser(@PathVariable long userId){
	this.userService.updateUser(userId);
}
}
