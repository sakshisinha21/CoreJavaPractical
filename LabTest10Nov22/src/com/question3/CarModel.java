/*
 * Program: get car model and name ,then print as constant.
 * @Author: Sakshi Priya
 * @Date: 10-Nov-2022
 * */

//declaring package name
package com.question3;

//import scanner class
import java.util.Scanner;

//create class name
public class CarModel {
	
	static Scanner sc=new Scanner(System.in);
	
	String name,mod;
	
	//Method to enter Car Details
	void getCarDetails()
	{
		
		System.out.println("Enter Car's Company Name:");
		name = sc.next();
		
		System.out.println("Enter Car's Model Name:");
		mod = sc.next();
		
	}
	
	//Method for display Car Details
	void display()
	{
		System.out.println("Company: "+name+"\nModel:"+mod);
	}

	public static void main(String[] args) {
		
		        //Declaring Variables
				int i,n;
				System.out.println("Enter The No. Of Cars:");
				n = sc.nextInt();
				
				//Creating object of the class
				CarModel obj[]=new CarModel[n];
				
				//This loop is for entering car details
				for(i=0;i<n;i++)
				{
					
					obj[i] = new CarModel();
					System.out.println("\nEnter data of Car "+(i+1)+"\n");
					obj[i].getCarDetails();
					
				}
				
				System.out.println("**************");
				System.out.println("Car Details:");
				System.out.println("-------------------------");
				
				//this loop is for display car details
				for(i=0;i<n;i++)
				{
					
					obj[i].display();
					System.out.println("-------------------------");
					
				}

	}
	//end of main

}
//end of class