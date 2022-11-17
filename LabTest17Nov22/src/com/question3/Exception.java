/*
 * Program: Peter wants to implement exception handling, such that if a user enters a menu input other
 * than 1, 2, or 3 in the game menu option, an appropriate user-defined exception should be generated.
 * In addition, a user-defined exception should be generated if the player inputs multiple characters,
 * instead of a single character to identify the possible alphabet in the word.
 * @Author: Sakshi Priya
 * @Date: 17-Nov-2022
*/

//declaring package name
package com.question3;

//import scanner
import java.util.Scanner;

//create class name
public class Exception {
	
	
	static void menu()
	
	{
		System.out.println("1: Play");
		System.out.println("2: Check Your Scores");
		System.out.println("3: Exit");
	}

	//main mathod
	public static void main(String[] args)
		
		int choice;
		try
		{
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			menu();
			System.out.println(choice);
		
			sc.close();
			
		}
		catch(Except e)
		
		{
			System.out.println(e.getMessage());
		}

}
//end of main mathod
	
}	
//end of class