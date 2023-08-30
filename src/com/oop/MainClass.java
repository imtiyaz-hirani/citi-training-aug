package com.oop;

public class MainClass {
	public static void main(String[] args) {
		/* Reach out to Service class
		 * That means create an Object 
		 */
		ResultService rs = new ResultService();
		rs.sayHello();
		
		int result = rs.computeSum(10, 20);
		System.out.println(result);
		
		GeometryService gs = new GeometryService();
		
		double areaCircle = gs.areaOfCircle(5.0);
		System.out.println("Are of circle is " + areaCircle);
	}
}
//class : A aObj = new A(); 
//class : B obj = new B();