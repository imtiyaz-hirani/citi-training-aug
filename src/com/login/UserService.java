package com.login;

import java.util.Scanner;

public class UserService {

	String readUsername(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		return username;
	}
	
	String readPassword(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = sc.next();
		return password; 
	}
	
	boolean validateLogin(String username,String password){
		boolean isValid=false; 
		
		switch(username) {
			case "admin":
				if(password.equals("admin"))
					isValid=true;
				break; 
			case "manager":
				if(password.equals("manager"))
					isValid=true;
				break; 
			case "employee12":
				if(password.equals("employee12"))
					isValid=true;
				break; 
			default:
				isValid=false;
				break; 
		}
		
		return isValid;
	}
}






