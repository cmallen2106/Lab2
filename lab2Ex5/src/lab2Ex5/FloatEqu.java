//Lab 2 - Exercise 5
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab2Ex5;

public class FloatEqu {

	public static void main(String[] args) {
		double a = ((1.0/10)*(1.0/10)); 
		double b = (1.0/100); 
		final double TOLERANCE = 0.00001; 
		
		System.out.println(a); 
		System.out.println(b); 
		
		if (a==b) {
			System.out.println("EQUAL"); 
		}
		if (Math.abs(a-b) < TOLERANCE) {
			System.out.println("Essentially Equal"); 
		}
		
		else {
			System.out.println("NOT EQUAL"); 
		}

	}

}
