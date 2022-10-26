/*
* Program: A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not."
*@Author: Sakshi Priya
*@Date: 26-Oct-2022
*/

package com.qus1;

//import Scanner Class
import java.util.Scanner;

//Create Class
public class Attendance {
	
	     //Method Calling
		 static void per(float tc,float ca)
		 {
			 
			 //Calculating the percentage
			 float percent=(ca*100)/tc;
			 
			 if(percent>=75)
				 System.out.println("Your Attendance is "+percent+"% Congrats You Are Eligiable for the Exams.");
			 else
				 System.out.println("Your Attendance is "+percent+"% Sorry You Are not Eligiable for the Exams.");
		 //Method End
		 }
		 
	public static void main(String[] args) {
		 
		 //Scanner class object 
		 Scanner sc=new Scanner(System.in);
		 
		 //Declaring Variables
		 int totalclass,classatd;
		 
		 System.out.println("Enter no. of classes happed:");
		 totalclass=sc.nextInt();
		 
		 System.out.println("Enter no. of classes you've attend:");
		 classatd=sc.nextInt();
		 
		 per(totalclass,classatd);
		 

	//Main method ends
	}
//End of class
}