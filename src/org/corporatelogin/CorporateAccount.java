package org.corporatelogin;                   

import org.individuallogin.ExistingAccount;
//child class

public class CorporateAccount{
	
	private void name() {
		
System.out.println("bala");
	}
	
	public static void main(String[] args) {
		
		CorporateAccount e = new CorporateAccount();
		e.name();
		
		ExistingAccount c= new ExistingAccount();
		c.userName();
		c.userPassword();
		c.userAddress();
		c.name();
		
		
		
	}
	
	
}



