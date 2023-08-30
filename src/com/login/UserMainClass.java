package com.login;

public class UserMainClass {
	public static void main(String[] args) {
		UserService us = new UserService();
		String username = us.readUsername();
		String password = us.readPassword();
		
		boolean isValid = us.validateLogin(username, password);
		
		if(isValid == true) {
			System.out.println("Welcome "+ username + ". You are logged In. ");
		}
		else {
			System.out.println("Login Denied");
		}
	}
}
/* 
 * main: <ctrl + enter> 
 * 
 */