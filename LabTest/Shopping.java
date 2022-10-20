/*Program:  WAP to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty , cost of one unit is 540)
@Author: Sakshi Priya
@Date: 20-Oct-2022
 */
 import java.util.Scanner;
 //create class name
 class Shopping
 {
 
 //calling method
	 static void Bill(int n)
	 {
	 
		 int total;
		 total=n*540;
		
    //checking the final bill 		
		 if(total>=2000)
			 System.out.println("Your Discount is 10% and Your Final Bill is "+(total-((10/100)*total))); //This method is to calculate the final bill
			 
		 else
			 System.out.println("Your Final bill is "+(total));
			 
	 }
	 
	 
	 //Main Method
	 public static void main(String args[])
	 
	 {
	 
	 //creating scanner class object
		 Scanner sc=new Scanner(System.in);
		 
	 //declaring variables
		 int unit;
		 
		 //taking input
		 System.out.println("Enter the number of units you purchases from shop:");
		 unit=sc.nextInt();
		 Bill(unit);
		 
		 
	//end of main method	 
	 }
	 
	 //end of class
 }