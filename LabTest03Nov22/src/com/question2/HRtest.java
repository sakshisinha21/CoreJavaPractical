/*
*Hotel Test class
*@Name: Sakshi Priya
*@Date: 03-Nov-2022
*/

//declaring class name
package com.question2;

//Import Scanner class
import java.util.Scanner;

//creating class
public class HRtest {
	
	//Method Calls
	static void menu()
	{
		System.out.println("1: Choose Hotel");
		System.out.println("2: Do you want AC facility(true/false)??");
		System.out.println("3: Exit");
		
	}
	
	
	
	//Main Method
	public static void main(String[] args) {
		
		//Scanner Object
		Scanner sc = new Scanner(System.in);
		int ch=0;
		
		do
		{
			
			//Method Calling
			menu();
			ch = sc.nextInt();
			
			
			switch(ch)
			{
			
			case 1:
				System.out.println("Enter Type Of Room You Want(Standard/Deluxe/SuperDeluxe):");
				String room = sc.next();
				break;
				
			case 2:
				System.out.println("Do you want AC facility(true/false)");
				boolean ac = sc.nextBoolean();
				break;
				
			case 3:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice");
				
				
			System.out.println("Do you want to perform more operation:(1-yes/2-no)");
			ch = sc.nextInt();
			}
			
		}
		while(ch==1);
		
		sc.close();
	}

}