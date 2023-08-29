package com.p1;
import java.util.Scanner;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String name = sc.next();
		System.out.println("welcome " + name);
		
		while(true) {
			System.out.println("***********Main Service Menu*************");
			System.out.println("1. New Account");
			System.out.println("2. Mutual Funds or SIPs");
			System.out.println("3. Loan Info ");
			System.out.println("0. To Exit");
			System.out.println("*************************************");
			int input = sc.nextInt(); //1 - 2 - 3 - 0
			if(input == 0) {
				System.out.println("Thank You " + name + "... Exited.. ");
				break; //comes out of the while... 
			}
			switch(input) { //level 1: switch
				case 1:
					 while(true) {
						 System.out.println("---New Account Options---");
						 System.out.println("1. SAVINGS Account Info");
						 System.out.println("2. CURRENT Account Info");
						 System.out.println("3. DMAT Account INfo");
						 System.out.println("0. To go back to main menu");
						 int accountInput = sc.nextInt();
						 if(accountInput == 0) {
							 System.out.println("going back to the previous menu..");
							 break; 
						 }
						 switch(accountInput) {
						 case 1: 
							 System.out.println("Savings account has 4% ROI per annum");
							 break;
						 case 2: 
							 System.out.println("Current account does not give you any interest but has more transaction limits");
							 break; 
						 default: 
							 System.out.println("Invalid input pressed..");
							 break; 
						 }
					 }
					 
					break; //to come out of case 
				case 2: 
					while(true) {
						System.out.println("---Mutual Funds or SIPs----");
						System.out.println("1. Lump Sum payment MF");
						System.out.println("2. SIP MF");
						System.out.println("0. To go back to main menu");
						int mfInput= sc.nextInt();
						if(mfInput == 0) {
							 System.out.println("going back to the previous menu..");
							 break; 
						}
						switch(mfInput) {
						case 1:
							System.out.println("Lumsump options go here... ");
							break;
						case 2: 
							System.out.println("sip options go here... ");
							break;
						default: 
							System.out.println("Invalid input pressed..");
							break; 
						}
					}
					break; 
				case 3: 
					//do something
					break; 
				default: 
					System.out.println("Invalid input pressed..");
					break; 
			} //switch ends
			
		}//while loop ends
	}

}





