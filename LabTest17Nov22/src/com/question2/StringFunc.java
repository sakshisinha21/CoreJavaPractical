/*
 * Program: write 5 functions of string in java program
 * @Author: Sakshi Priya
 * @Date: 17-Nov-2022
*/

//declaring package name
package com.question2;

//import scanner
import java.util.Scanner;

//create class name
public class StringFunc {
	
	Scanner sc = new Scanner(System.in);
	void upperCase()
	{
		
		//create string
		String str1="Java is an object oriented programing language";
		System.out.println(str1.toUpperCase());
		
	}
	void Length()
	{
		
		String str2="Hello I'm Sakshi Priya";
		System.out.println("Length of String: "+str2.length());
		
	}
	void IndexOf()
	{
		
		String str3 = "We are joining Kamatchi Mam's class";
		System.out.println(str3.indexOf("joining"));
	
	}
	void CharAt()
	{
		
		String str4 = "I love to visit Kedarnath Temple";
		System.out.println(str4.charAt(12));
	
	}
	void Equals()
	{
		
		String Str5 = "Sakshi";
		String Str6 = "Shaili";
		String Str7 = "Sakshi";
		System.out.println(Str5.equals(Str6)); //return false becase they are not equal
		System.out.println(Str5.equals(Str7)); //return true because they are equal
	
	}

	//main method
	public static void main(String[] args) {
		
		
		StringFunc obj = new StringFunc();
		obj.upperCase();
		obj.Length();
		obj.IndexOf();
		obj.CharAt();
		obj.Equals();
		

	}
	//end of main

}
//end of class
