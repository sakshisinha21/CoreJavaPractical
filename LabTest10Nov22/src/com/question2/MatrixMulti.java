/*
 * Program: WAP in Java to multiply two Matrixes?
 * @Author: Sakshi Priya
 * @Date: 10-Nov-2022
 * */

//declaring package name
package com.question2;

//Import scanner class
import java.util.Scanner;

//Create Class
public class MatrixMulti {

	//Declaring Variables
	int a[][],b[][],i,j,m,n,k,s;
	
	
	//Scanner Class Object
	Scanner sc = new Scanner(System.in);
	
	
	//Method for Create two matrixes by entering rows and columns
	void create()
	{
		
		System.out.println("Enter no. of Rows you want:");
		m=sc.nextInt();
		
		System.out.println("Enter no. of Columns you want:");
		n=sc.nextInt();
		
		a=new int[m][n];
		b=new int[m][n];
		
		//Enter 1st Matrix Elements
		
		System.out.println("\n-----------------------------------");
		System.out.println("Enter 1st Matrix of the Elements:");
		for(i=0;i<m;i++)
		{
			
			for(j=0;j<n;j++)
			{
				
				a[i][j] = sc.nextInt();
				
			}
		}
		
		//Enter 2nd Matrix Elements
		System.out.println("\n-----------------------------------");
		System.out.println("Enter 2nd Matrix of the Elements:");
		for(i=0;i<m;i++)
		{
			
			for(j=0;j<n;j++)
			{
				
				b[i][j] = sc.nextInt();
				
			}
		}
	}
	
	//Method for display both the matrixes
	void display()
	{
		
		//For Display 1st Matrix
		System.out.println("\n\n**************************************");
		System.out.println("1st Matrix Elements are:");
		for(i=0;i<m;i++)
		{
			
			for(j=0;j<n;j++)
			{
				
				System.out.print(a[i][j]+"\t");
				
			}
		System.out.println();
		}
		
	//For Display 2nd Matrix
	System.out.println("\n2nd Matrix Elements are:");
	for(i=0;i<m;i++)
	{
		
		for(j=0;j<n;j++)
		{
			
			System.out.print(b[i][j]+"\t");
			
		}
	System.out.println();
	}
	}
	
	//method for multiplying both the matrixes and dispaly the output.
	void mul()
	{
		
		System.out.println("\n\n------------------------------------------------");
		System.out.println("And Here The Multipled of both Matrixes are:");
		
		
		for(i=0;i<m;i++)
		{
			
			for(j=0;j<n;j++)
			{
				
				s=0;
				
				for(k=0;k<n;k++)
				{
					
					s=s+a[i][k]*b[k][j];
					
				}
			System.out.print(s+"\t");
			}
	System.out.println();
	
		}
	}
	
	//Main Method
	public static void main(String args[])
	{
		//Creating object of the class
		MatrixMulti obj=new MatrixMulti();
		
		//Method Calling
		obj.create();
		obj.display();
		obj.mul();
	}
	//End of Main Method

}
//End of Class