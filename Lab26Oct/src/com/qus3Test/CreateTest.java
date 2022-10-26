/*
* Create Employee Test 
* @Author: Sakshi Priya
* @Date:26-Oct-2022
*/

//declaring package name
package com.qus3Test;

//import scanner class
import java.util.Scanner;


//import package
import com.qus3Details.CreateDetails;


//Creating a Class
public class CreateTest {

	public static void main(String[] args) {
		
		        //create the object of CreateDetails class
				CreateDetails emp = new CreateDetails();

				//declare an object of Scanner class
				Scanner sc = new Scanner(System.in);

				//declaring variables
			    String name;
			    int id;
			    String department;
				float salary;

				//taking input for employees details
				System.out.println("Enter Employee's Name:");
				name = sc.nextLine();
				
				System.out.println("Enter Employee's Id:");
				id = sc.nextInt();
				
				System.out.println("Enter Employee's Department:");
				department = sc.next();
				
				System.out.println("Enter Employee's Salary:");
				salary = sc.nextFloat();

				
				//calling all the methods
				emp.getDetails(name, id, department,salary);

				
                System.out.println("-----------------------------");
				System.out.println("-----------------------------");

				// Print the details
				emp.printDetails();
				sc.close();

	//End of main
	}
	
//End of class
}