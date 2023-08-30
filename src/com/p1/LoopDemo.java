package com.p1;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		/* Display Hello Loop 10 times */
		
		for(int i=1;i<11;i++) {   //i=1,2....11
			System.out.println("hello loop " + i);  //1st 2nd 
		}

		/* Task: Compute SUM of first n even numbers using for loop */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of even numbers");
		int n = sc.nextInt(); //n=5  ; 2n+1 = 11
		
		for(int i=1; i<(2*n)+1 ;i++) {
			if(i % 2 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println("\n*********ODD in REVERSE*********");
		/* Task: Display ODD numbers from 1 to 20 in reverse Order (i=20 .. 1  )
		 * 19 17 15 13 11 .... 1 */
		for(int i=20;i>0;i-- ) { //i=20,19,18,...1
			if(i % 2 != 0)
				System.out.print(i + " ");
		}
		
	}

}
/* int i=1  ... 2 3 4 5 6 7 8  11(stop) i<11 - termination condition
 * i=i+1; // 4
 * increment/decrement operator: i++ i--
 * 
 * CONDITION-BODY-OPERATOR until CONDITION is TRUE 
 */