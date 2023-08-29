package com.p1;
 import java.text.DecimalFormat;
import java.util.Scanner; 
public class App {
	public static void main(String[] args) {
		/* Take the input from the user using Scanner class  
		 * Scanner comes from java.util package
		 * it has next() method that can help us read data from console 
		 * */
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Subject 1: Maths- out of 100");
		double marks1 = sc.nextDouble();
		/* Validation for marks1 */
		if(marks1 > 100 || marks1<0) {
			System.out.println("You entered Illegal marks value. ");
			return; 
		}
		//System.out.println(marks1);  -- testing 
		System.out.println("Enter marks of Subject 2: English- out of 100");
		double marks2 = sc.nextDouble();
		/* Validation for marks1 */
		if(marks2 > 100 || marks2<0) {
			System.out.println("You entered Illegal marks value. ");
			return; 
		}
		
		System.out.println("Enter marks of Subject 3: Science- out of 100");
		double marks3= sc.nextDouble();
		/* Validation for marks1 */
		if(marks3 > 100 || marks3<0) {
			System.out.println("You entered Illegal marks value. ");
			return; 
		}
		/* After reading the marks, add them  */
		double total = marks1+marks2+marks3; 
		//System.out.println(total); -- testing 
		
		/* After total, compute percentage out of 300 */
		double percentage = (total * 100) / 300; 
		System.out.println("You Scored: " + df.format(percentage) + "%");
		
		/* Compute Grade */
		String grade="";
		if(percentage > 75) { //FALSE
			grade="A";
		}
		else
		if(percentage > 60) { //FALSE
			grade="B";
		}
		else
		if(percentage > 40) {
			grade="C";
		}
		else {
			grade="FAILED";
		}
		System.out.println("Grade is: " + grade);
	}
}
