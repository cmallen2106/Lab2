//Lab 2 - Exercise 4
//Christina Sosa
//Programming Fundamentals, Summer 2021
package lab2Ex4;

import java.util.Scanner;
import java.util.Random;

public class AgeGuess {
	public static void main(String[]args) {
		
		Random randNum = new Random();
		
		//Declare a new int variable age &
		//Initialize age to a random integer between 0 and 100 (inclusive)
		int age = randNum.nextInt(100); 
		
		try (Scanner scan = new Scanner (System.in)) {
			int ageGuess; 
			
			//Asks the user for a guess, save the guess into the ageGuess variable
			System.out.println("Guess the age:"); 
			ageGuess = scan.nextInt(); 
			
			
			//Display the user guess and the correct answer
			System.out.println("The age you guessed is " + ageGuess + ", and the correct age is " + age + "!");
		}
		
	}
}