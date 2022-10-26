/*
*Program:  WAP to print the tagline of various IT companies using enhanced switch case .
*@author: Sakshi Priya
*@Date: 26-Oct-2022  
*/

//declaring package
package com.qus2;

//import Scanner class
import java.util.Scanner;

//Create Tagline class
public class ItCompanies {
	
	    //method to print Tagline
		static void printTaglines(String tag)
		{
			
			//Switch Case
			switch(tag)
		    {
			 
			   //expression
			   case "accenture"->System.out.println("Ideate, Innovate, Change the world, Repeat....");		               
	           case "google"->System.out.println("Don't be evil");		              		
	           case "wipro"-> System.out.println("Spirit of Wipro");		               	
	           case "amazon"-> System.out.println("Earth's most customer centric company");		               	

	           default-> System.out.println("Wrong input");						
		    //End of Switch
		    } 
			
		}	
		
		
	//Main method starts
	public static void main(String[] args) 
	{
		
		   // Declaring Variables
		   String input;
		   
		   //creating the object of scanner
		   Scanner sc = new Scanner(System.in);
			
		   //printing companies name for getting taglines
		   System.out.println("Enter an Company's Name for Taglines(accenture,google,wipro,amazon):");
		   input= sc.next().toLowerCase();
		   
		   //Method Calling
		   printTaglines(input);
	//end of method
    }

	
//end of class
}