package com.niit.Backend.Testcases;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.dao.CategoryDAO;
import com.niit.Backend.model.Category;


public class CategoryTestcases
{

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;

@BeforeClass
public static void intit()
{
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.Backend");
	context.refresh();
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}



@Test
public void testAddCategory()
{
	category=new Category();
	category.setName("television");
	category.setDescription("desrcription about tv");
	category.setImageURL("cat_106.png");
	
	assertEquals("successfully added a category inside table",true,categoryDAO.add(category));
}
/*
@Test
public void testUpdateCategory()
{
	category=new Category();
	category.setName("television");
	category.setDescription("desrcription about tv");
	category.setImageURL("cat_106.png");
	assertEquals("successfully added a category inside table",true,categoryDAO.Update(category));
}
@Test
public void testdeleteCategory()
{
	category=new Category();
	category.setName("television");
	category.setDescription("desrcription about tv");
	category.setImageURL("cat_106.png");
	assertEquals("successfully added a category inside table",true,categoryDAO.delete(category));
}

*/
}







