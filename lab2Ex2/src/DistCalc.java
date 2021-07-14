//Lab 2 - Exercise 2
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistCalc {
	public static void main(String[]args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("What is X1?"); 
			double x1 = scan.nextDouble();
			
			System.out.println("What is y1?"); 
			double y1 = scan.nextDouble();
			
			System.out.println("What is X2?"); 
			double x2 = scan.nextDouble();
			
			System.out.println("What is y2?"); 
			double y2 = scan.nextDouble();
			
			double sqrt = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			
			// Round the output to three decimal places
			  DecimalFormat fmt = new DecimalFormat ("0.###");
			  
			  System.out.println("The distance between ("+x1+","+y1+"),"+"("+x2+","+y2+") " + "is " + fmt.format(sqrt));
		}

	}
}
