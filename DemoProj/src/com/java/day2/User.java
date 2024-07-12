package com.java.day2;

public class User {
	  protected int user_id;
	    protected int password;
	    
	   
	    public User(int user_id, int password) {
	        this.user_id = user_id;
	        this.password = password;
	    }
	    
	    public void login() {
	        System.out.println("User logged in with ID: " + user_id);
	    }

}
