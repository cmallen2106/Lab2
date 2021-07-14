//Lab 2 - Exercise 6
//Christina Sosa
//Programming Fundamentals, Summer 2021


package lab2Ex6;

import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		int number; 
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Enter a number between 0 and 9:"); 
		number = scan.nextInt(); 
		
		switch(number) {
			case 0: 
				System.out.println ("Zero"); 
				break; 
			
			case 1: 
				System.out.println ("One"); 
				break; 
				
			case 2: 
				System.out.println ("Two"); 
				break; 
			
			case 3: 
				System.out.println ("Three"); 
				break; 
			
			case 4: 
				System.out.println ("Four"); 
				break; 
				
			case 5: 
				System.out.println ("Five"); 
				break; 
				
			case 6: 
				System.out.println ("Six"); 
				break; 
				
			case 7: 
				System.out.println ("Seven"); 
				break; 
				
			case 8: 
				System.out.println ("Eight"); 
				break; 
				
			case 9: 
				System.out.println ("Nine"); 
				break; 
				
			default: 
				System.out.println ("You did not enter a number between 0 - 9. Please try again."); 
		
		}
	}

}
