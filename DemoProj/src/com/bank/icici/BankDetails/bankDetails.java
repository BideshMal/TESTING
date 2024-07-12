package com.bank.icici.BankDetails;
import com.bank.icici.accountDetails.*;
import com.bank.icici.customerDetails.*;
public class bankDetails {
	
		String Name;
		String IFSC_code;
//		public static void CreditCardApproval(int creditScore) {
//			
//		}
		public static boolean CreditCardApproval(int creditScore) {
			// TODO Auto-generated method stub
			if(creditScore>=750) {
				//accountDetails.creditLimit(creditScore);
				return true;
			}else {
				return false;
			}
			
		}
		
	
}
