package com.bank.icici.customerDetails;
import java.util.Scanner;
import com.bank.icici.BankDetails.*;
import com.bank.icici.accountDetails.*;
public class customerDetails {
String name;
int cust_id;
int creditScore;
boolean creditCard_ApplicationStatus;

Scanner s=new Scanner(System.in);
public String getName() {
	System.out.println("Cust Name?");
	name=s.nextLine();
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCust_id() {
	System.out.println("Cust ID?");
	cust_id=s.nextInt();
	return cust_id;
}

public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}

public int getCreditScore() {
	System.out.println("Cust creit score?");
	creditScore=s.nextInt();
	return creditScore;
}

public void setCreditScore(int creditScore) {
	this.creditScore = creditScore;
}

public boolean isCreditCard_ApplicationStatus(int creditScore) {
	creditCard_ApplicationStatus=bankDetails.CreditCardApproval(this.creditScore);
	return creditCard_ApplicationStatus;
}

public void setCreditCard_ApplicationStatus(boolean creditCard_ApplicationStatus) {
	this.creditCard_ApplicationStatus = creditCard_ApplicationStatus;
}

public int Fetch_CreditScore(int creditScore) {
	int credit=accountDetails.show_credit(this.creditScore);
	return credit;
}

public static void main(String[] args) {
	customerDetails myDetails=new customerDetails();
	myDetails.name=myDetails.getName();
	myDetails.setName(myDetails.name);
	myDetails.cust_id=myDetails.getCust_id();
	myDetails.setCust_id(myDetails.cust_id);
	myDetails.creditScore=myDetails.getCreditScore();
	myDetails.setCreditScore(myDetails.creditScore);
	//boolean status=myDetails.isCreditCard_ApplicationStatus(myDetails.creditScore);
	
	
	System.out.println("Choose Option");
	System.out.println("1.Apply for credit card");
	System.out.println("2.Check for credit limit");
	Scanner scan=new Scanner(System.in);
	int option=scan.nextInt();
	switch(option){
	case 1:
		boolean status=myDetails.isCreditCard_ApplicationStatus(myDetails.creditScore);
		if(status) {
			System.out.println("Approved");
			System.out.println();
		}else {
			System.out.println("Not Approved");
		}
	case 2:
		int creditLimit=myDetails.Fetch_CreditScore(myDetails.creditScore);
		System.out.println(creditLimit);
		
	}
	
}

}
