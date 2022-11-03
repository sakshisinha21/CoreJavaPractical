/*
*Program:-"Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
 1 - without any parameter - no amount will be added to the Piggie Bank                
 2 - having a parameter which is the amount that will be added to the Piggie Bank                
 Create an object of the 'AddAmount' class and display the final amount in the Piggie Bank"
*@Author:- Sakshi Priya
*@Date:- 03-Nov-2022
*/


//declaring package name
package com.question3;

//importing packages
import java.util.Scanner;

//declaring class
public class PGTest {
	
	
    //creating menu
	static void menu() {
		
		
		// method to display  the options
		System.out.println("1.Deposit Money");
		System.out.println("2.Exit");
		System.out.println("Enter Choice:");
}

	
	//main started
	public static void main(String[] args) {
		
		// creating an object of MyPiggiBank
		PiggiBank piggi= new PiggiBank();
		
		//creating an object of scanner 
		Scanner sc = new Scanner(System.in);
		
		//declaring a variable
		int choice = 0;
		
		//creating a do while loop
		do {
			
			
			//calling menu
			menu();
			
			//taking the choice of user
			choice = sc.nextInt();
			switch (choice) {
			
			
			case 1:
				System.out.println("Enter The Amount That You Want To Add To The Piggi Bank:");
				double amount = sc.nextDouble();
				System.out.println("Balance :" + piggi.addMoney(amount));
				break;
				
				
			case 2:
				//to exit from the choice
				System.exit(0);
				break;
				
				
			default:
				//printing the choice
				System.out.println("Please Enter A Valid Choice");
				
			} 
			//end of switch 
			
			
			//taking input from user to add more money
			System.out.println("Do you want to perform more operation:(1-Yes/2-No)");
			choice = sc.nextInt();

			
		}
		while (choice == 1);
		//end of do while loop

		
		sc.close();

		
   }
   //end of main method

	
}
// end of class