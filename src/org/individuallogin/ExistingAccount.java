package org.individuallogin;

public class ExistingAccount extends CreateNewAccount {
	//parent class
	public void userName() {
		System.out.println("username is bala@1234");
	}
	public void userPassword() {
		System.out.println("12345678");

	}
	public static void main(String[] args) {
		
		ExistingAccount c= new ExistingAccount();
		c.userName();
		c.userPassword();
		c.userAddress();
		c.name();
		
	}
	
	
	
	

}
