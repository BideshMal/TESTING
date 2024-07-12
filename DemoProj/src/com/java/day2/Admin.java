package com.java.day2;

	public class Admin extends User {
	    
	    public Admin(int user_id, int password) {
	        super(user_id, password); 
	    }
	    
	    public void manageUsers() {
	        System.out.println("Admin managing users...");
	    }
	}

