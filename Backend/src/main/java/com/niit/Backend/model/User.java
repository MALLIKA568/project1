package com.niit.Backend.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int userid;

private String username;

private String role;
private String password;
private String email;
@Column(name="is_active")
private boolean active=true;
public int getuserid() 
{
  return userid;
}

public void setuserid(int id) 
{
   this.userid = id;
}

public String getusername() 
{
   return username;
}

public void setusername(String name) 
{
   this.username = name;
}

public String getrole() 
{
   return role;
}

public void setrole(String role) 
{
   this.role = role;
}

public String getpassword() 
{
  return password;
}

public void setpassword(String password) 
{
   this.password = password;
}

public String getemail() 
{
  return email;
}

public void setemail(String email) 
{
   this.email = email;
}

public boolean isActive() 
{
   return active;
}
public void setActive(boolean active) 
{	
   this.active = active;
}
}