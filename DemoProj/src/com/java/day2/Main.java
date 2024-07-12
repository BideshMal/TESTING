package com.java.day2;

public class Main {
	
	    public static void main(String[] args) {
	       
	        Trainee trainee = new Trainee(1001, 1234);
	        Admin admin = new Admin(2001, 5678);
	        
	        User userTrainee = new Trainee(3001, 4321); //Here I am Polymorphism using Upcasting
	        
	        trainee.login();
	        trainee.empLogin();
	        trainee.accessTrainingMaterial();
	        
	        admin.login();
	        admin.manageUsers();
	        
	        
	        userTrainee.login(); // It Calls Trainee's login method
	        // userTrainee.accessTrainingMaterial(); // It will throwError: accessTrainingMaterial() not in User type
	        
	       
	        if (userTrainee instanceof Trainee) {
	            Trainee traineeObj = (Trainee) userTrainee; //downcasting
	            traineeObj.accessTrainingMaterial();
	        }
	    }
	
}
