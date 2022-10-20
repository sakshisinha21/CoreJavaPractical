/*Program: WAP to find the 
1.square
2. cube 
3. check number is even or odd using switch case."
@Author: Sakshi Priya
@Date: 20-Oct-2022
 */
 //Import scanner class
 import java.util.Scanner;
 
 //Create class
 class SquareCubeOddEven
 {
	 //Calling Method
	 static void Square(int n1)
	 {
		System.out.println("Square of a no.: "+(n1*n1));
	 }//end of method
	 
	 //Calling Method
	 static void Cube(int n2)
	 {
		 System.out.println("Cube of a no.: "+(n2*n2*n2));
	 }//end of method
	 
	  //Calling Method
	 static void OddEven(int n3)
	 {
		 
		 //checking odd or even
		 if(n3%2==0)
			 System.out.println("No. is Even: "+(n3));
		 else
			 System.out.println("No. is Odd: "+(n3));
	 }//end of method
	 
	 //Main Method
	 public static void main(String args[])
	 {
		 //Creating Scanner Class Object
		 Scanner sc=new Scanner(System.in);
		 
		 //declaring variables
		 int number,n;
		 System.out.println("Enter a no: ");
		 number=sc.nextInt();
		 
		 //taking input
		 System.out.println("Choose the option");
		 System.out.println(" 1: Square \n 2: Cube \n 3: odd or even");
		 n=sc.nextInt();
		 
		 //Creating Switch Case
		 switch(n)
		 {
			 case 1: Square(number);
				break;
			 case 2: Cube(number);
				break;
			 case 3: OddEven(number);
				break;
			default: System.out.println("Wrong Choice");
		 }//End of switch case
		 
		 
		 
		 
		 
	 }//End of Main Method
 }//End of Clas