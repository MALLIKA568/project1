package com.niit.Backend.dao;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import com.niit.Backend.model.User;

	public interface UserDAO 
	{
	  List<User> list();
	  
	  boolean add(Use user);
	  boolean Update(User user);
	  boolean delete(User user);
	}