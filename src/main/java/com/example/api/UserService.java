package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
private UserRepo userRepo;

public List<User1> getUser() {
	return userRepo.findAll();
}

public User1 saveUser(User1 user) {
  userRepo.save(user);
	return user;
}

public User1 updateUser(User1 user) {
	userRepo.save(user);
	return user;
}


public void updateUser(long userId) {
userRepo.deleteById(userId);	
}
}