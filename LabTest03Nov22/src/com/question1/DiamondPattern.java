/*
*Program:- WAP in java to draw a diamond?
*@Author:- Sakshi Priya
*@Date:- 03-Nov-2022
*/

//declaring package name
package com.question1;

//Import Scanner Class
import java.util.Scanner;

//Creating a class
public class DiamondPattern {
	
	//calling methods
	static void drawPattern(int size)
	{
		
		//Declaring Variables
		int i,j;
		
		//Outer For Loop
		for(i=1;i<=size;i++)
		{
			
			//First Inner For Loop
			for(j=size;j>i;j--)
			{
			System.out.print(" ");
			} 
			//End of First Inner For Loop
			
			
			//Second Inner For Loop
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			//End of Second Inner For Loop
			
			
			System.out.println();//For line break
		}
		//End of Outer For Loop
		
		
		        //Outer For Loop
				for(i=1;i<=size;i++)
				{
					
					//First Inner For Loop
					for(j=1;j<i;j++)
					{
						System.out.print(" ");
					}
					//End of First Inner For Loop
					
					
					//Second Inner For Loop
					for(j=(size-1);j>=i;j--)
					{
						System.out.print(" *");
					}
					//End of Second Inner For Loop
					
					
					System.out.println();//For line break
				}
				//End of Outer For Loop
		
		
	//End of Method
	}
	

	//Main Method Starts
	public static void main(String[] args) {
		
		//Object of Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range in pattern:");
		int range=sc.nextInt();
		
		//Method Calling
		drawPattern(range);
		
		sc.close();

	}

}

//end of class                                  