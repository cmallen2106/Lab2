//Lab 2 - Exercise 1
//Christina Sosa
//Programming Fundamentals, Summer 2021
package lab2Ex1;

import java.util.Scanner;
import java.util.Random;

public class AgeGuess {
	public static void main(String[]args) {
		
		Random randNum = new Random();
		
		int age = randNum.nextInt(100); 
		
		
		
		Scanner scan = new Scanner (System.in);
		
		int ageGuess; 
		
		System.out.println("Guess the age:"); //Asking user to gues age
		ageGuess = scan.nextLine(); 
		
		
		//Reading out name and age to user
		System.out.println("The age you guess is " + ageGuess + "and the correct age is" + age);
		
	}
}
