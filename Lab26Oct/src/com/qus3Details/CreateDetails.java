/*
* Program: WAP to create a package called Employee having ID, name , department and salary .
Create 2 method 
GetDetails()
PrintDetails()
Create a Employee Test class in  a separate package to get the Details of 2 employees and print the details  of both of them"
* @Author: Sakshi Priya
* @Date: 26-Oct-2022
*/

//declaring package
package com.qus3Details;

//declaring Class
public class CreateDetails {
	
	    // declaring variables
	    String Ename;
		int Eid;
		String department;
		float salary;

		// declaring method to get the details of Employee
		public void getDetails( String n, int id, String d, float sal) {
			Ename = n;
			Eid = id;
			department = d;
			salary = sal;
			
		//end of Method
		}
		
		
		//printing the details of employees
		public void printDetails() {
			System.out.println("Employee Details are:");
			System.out.println("Employee Name:"+ Ename);
			System.out.println("Employee ID:"+ Eid);
			System.out.println("Employee Department:"+ department);
			System.out.println("Employee Salary:"+ salary);
			

		//end of Method
		}
		

//end of Class
}