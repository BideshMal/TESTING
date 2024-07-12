package com.java.day2;

public class Trainee extends User implements Employee {
	
    public Trainee(int user_id, int password) {
        super(user_id, password); //Here I am calling the constructor of user.java
    }
    
    @Override
    public void empLogin() {
        System.out.println("Trainee logged in with ID: " + user_id);
    }
    
    public void accessTrainingMaterial() {
        System.out.println("Trainee accessing training material...");
    }
}
