package com.niit.Backend.dao;

import java.util.List;

import com.niit.Backend.model.Category;

public interface CategoryDAO
{
  List<Category> list();
  Category get(int id);
  boolean add(Category category);
  boolean Update(Category category);
  boolean delete(Category category);
}