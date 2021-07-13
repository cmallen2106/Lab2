//Lab 2 - Exercise 3
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Scanner;
import java.util.Random;

public class UserNames {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		String firstName; 
		String lastName; 
		Random rand = new Random();

		int randnum = 10 + rand.nextInt(99); //generate a number between 10-99
		
		System.out.println("What is your first name?"); //Asking for user first name
		firstName = scan.nextLine(); 
		
		System.out.println("What is your last name?"); //Asking for user last name
		lastName = scan.nextLine(); 
		
		scan.close();
		
		//Reading out new userName
		System.out.println("Your username is " + lastName.substring(0,4)+firstName.substring(0,1)+randnum);
		
	}

}
