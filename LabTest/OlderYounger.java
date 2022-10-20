/*Program: Take input of age of 3 people by user and determine oldest and youngest among them.
@Author: Sakshi Priya
@Date: 20-oct-2022
 */
 //Import Scanner Class
 import java.util.Scanner;
 
 //Create class
 class OlderYounger
 {
	 
	 //Calling Method
	 static void ageOldest(int num1,int num2,int num3) //This method returns the value of oldest person
	 {
		 
		 //checking older age
		 if((num1>num2)&&(num1>num3))
			 System.out.println("First Person is oldest and it's age is "+num1);
		 
		 else if(num2>num3)
			 System.out.println("Second Person is oldest and it's age is "+num2);
		 
		 else
			 System.out.println("Third Person is oldest and it's age is "+num3);
		 
		 
	//end of method	 
	 }
	
	 
	 //Calling Method
	 static void ageYoungest(int num4,int num5,int num6)//This method returns the value of youngest person
	 
	 
	 {
		

        //checking younger age
		if((num4<num5)&&(num4<num6))
			 System.out.println("First Person is youngest and it's age is "+num4);
		 
		 else if(num5<num6)
			 System.out.println("Second Person is youngest and it's age is "+num5);
		 
		 else
			 System.out.println("Third Person is youngest and it's age is "+num6);
		 
	//end of method	 
	 }
	 
	 //Main Method
	 public static void main(String args[])
	 {
	     //Creating Scanner Class Object
		 Scanner sc=new Scanner(System.in);
		 
		 //declaring variables
		 int p1,p2,p3;
		 
		 //taking input
		 System.out.println("Enter the age of three people:");
		 p1=sc.nextInt();
		 p2=sc.nextInt();
		 p3=sc.nextInt();
		 ageOldest(p1,p2,p3);
	     ageYoungest(p1,p2,p3);
		 
		 
	 }//End of Main Method
 }//End of Class