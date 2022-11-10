/*
 * Program: create a record of students using array in java
 * Write a java program to find common elements of 2 different arrays
 * get students marks in array and  print rank along with names
 * @Author: Sakshi Priya
 * @Date: 10-Nov-2022
 * */

//declaring package name
package com.question1;

//import Scanner Class
import java.util.Scanner;

//create class name
public class StudentRecords {
	
	//Create Scanner Class Object
	static Scanner sc=new Scanner(System.in);
	
	//Declaring Variables
	int id;
	String name, dep, gr;
	
	//Method to get Student Details
	void getData()
	{
		
		System.out.println("Enter The Name Of The Student:");
		name=sc.next();
		
		System.out.println("Enter The Student's ID:");
		id=sc.nextInt();
		
		System.out.println("Enter The Student's Department:");
		dep=sc.next();
		
		System.out.println("Enter The Student's Grade:");
		gr=sc.next();
	}
	
	//Method to display Student Details
	void display()
	{
		
		System.out.println("Student's Name: "+name);
		
		System.out.println("Student's ID: "+id);
		
		System.out.println("Student's Department: "+dep);
		
		System.out.println("Student's Grade: "+gr);
		
	}

	//Main Method
	public static void main(String[] args) {
		
		//Declaring Variables
		int i,n;
		System.out.println("Enter The No. Of Students:");
		n = sc.nextInt();
		
		//Creating object of The class
		StudentRecords obj[]=new StudentRecords[n];
		
		//This loop is for entering student details
		for(i=0;i<n;i++)
		{
			obj[i] = new StudentRecords();
			
			System.out.println("\nEnter data of Student "+(i+1));
			
			obj[i].getData();
		}
		
		System.out.println("****************");
		System.out.println("Student Details:");
		System.out.println("---------------------------------------");
		
		//This loop is for get student Details
		for(i=0;i<n;i++)
		{
			
			obj[i].display();
			System.out.println("------------------------------------");
			
		}

	}
	//End of Main

}
//End of class