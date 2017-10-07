package com.niit.Backend.daoimpl;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Backend.dao.UserDAO;
import com.niit.Backend.model.User;

@Repository("UserDAO")
@Transactional
public class UserDAOImpl implements UserDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<User> list() 
	{
	    String selectActiveCategory="FROM User WHERE active=:active";
	    Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
	    query.setParameter("active", true);
		return query.getResultList();
	}

	
	public boolean add(User user) 
	{
	   try
	   {
		   sessionFactory.getCurrentSession().persist(user);
		   return true;
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   return false;
	   }
		   
	}
	@Override
	public boolean Update(User user) 
	{
	   try
	   {
		   sessionFactory.getCurrentSession().persist(user);
		   return true;
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   return false;
	   }
		   
	}
	@Override
	public boolean delete(User user) 
	{
	   try
	   {
		   sessionFactory.getCurrentSession().persist(user);
		   return true;
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   return false;
	   }
		   
	}

	@Override
	public boolean add(Use user) {
		// TODO Auto-generated method stub
		return false;
	}


}