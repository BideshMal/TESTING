package com.bank.icici.accountDetails;

public class accountDetails {
//int accountNo;
//String accountType;
int creditLimit=0;

public static void creditLimit(int creditScore) {
	accountDetails myacc=new accountDetails();
	if(creditScore>=750 && creditScore<800)
	myacc.creditLimit=100000;
	if(creditScore>=800)
	myacc.creditLimit=200000;
	
	
}
public static int show_credit(int creditScore) {
	accountDetails myacc=new accountDetails();
	if(creditScore>=750 && creditScore<800)
	myacc.creditLimit=100000;
	if(creditScore>=800)
	myacc.creditLimit=200000;
	return myacc.creditLimit;
	
}

}
