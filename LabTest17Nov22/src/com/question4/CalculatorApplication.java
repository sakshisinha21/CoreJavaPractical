/*
* Program: Create a calculator application in Java that will accept two numbers. Further, the calculator application should be able to perform the following operations one at a time on the two numbers:
  Addition
  Subtraction
  Multiplication
  Division
  You need to implement exception handling that both the numbers should be greater than 0. Further, the operator used to perform the calculations should only be +,-, *, or, /.
* @Author: Sakshi Priya
* Date: 17-Nov-2022
*/

//declaring package name
package com.question4;

//import Scanner Class
import java.util.Scanner;

//create class name
public class CalculatorApplication {
	
	//main method
	public static void main(String args[])
	{
		
		//Declaring Variables
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
        //decalring variable
		int ch=0;

		//creating a loop
		do {
		
		try 
		{
		
		System.out.println("Enter Two Numbers.....");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Choose Any One Operation To Perform....");
		
		System.out.println("1: Addition\n"+"2: Subtraction\n"+"3: Multiplication\n"+"4: Division\n");
		c = sc.nextInt();
		
        //appliying switch case to perform the operations
		switch(c)
		{
			case 1:
				System.out.println("Add: "+ (a+b));
				break;
				
			case 2:
				System.out.println("Sub: "+ (a-b));
				break;
				
			case 3:
				System.out.println("Mul: "+ (a*b));
				break;
				
			case 4:
				System.out.println("Div: "+ (a/b));
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
		}
		
		//to perform more expressions
		System.out.println("Do you want to perform more operation:(1-Yes/2-No)");
		ch=sc.nextInt();
		
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	} while (ch==1);
	//ends of do while
		
		sc.close();
	
	//end of method	
	}
	
}
//end of class