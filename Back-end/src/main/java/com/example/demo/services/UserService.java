package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo urepo;
	
	public List<User> getUser()
	{
		return urepo.findAll();
	}
	
	public String getUser(String email,String password)
	{
		return urepo.getUser(email,password);
	}
	
}
