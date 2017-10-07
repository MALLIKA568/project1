package com.niit.Backend.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Backend.dao.CategoryDAO;
import com.niit.Backend.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO
{
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> list() {

		String selectActiveCategory="FROM Category WHERE active=:active";
	    Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
	    query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	public Category get(int id) {

		// TODO Auto-generated method stub
		return  sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
	
		

	}

	@Override
	public boolean add(Category category) {
		   try
		   {
			   sessionFactory.getCurrentSession().persist(category);
			   return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   return false;
		   }
	}

	@Override
	public boolean Update(Category category) {
		   try
		   {
			   sessionFactory.getCurrentSession().persist(category);
			   return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   return false;
		   }
	}

	@Override
	public boolean delete(Category category) {
		   try
		   {
			   sessionFactory.getCurrentSession().persist(category);
			   return true;
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
			   return false;
		   }
			   
	}

	
	
}