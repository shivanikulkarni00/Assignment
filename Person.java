//Assignment 1: Validating Age and Income

//Write a program that checks if a person is eligible for a loan based on their age and income.

//Requirements:

//•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.

//•    Use logical && to combine these conditions.



package Assignment1;



import java.util.Scanner;



public class Person {

	public static void main(String[] args) {

		

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the age");

		int age=sc.nextInt();

		System.out.println("enter the income");

		int income=sc.nextInt();

		

		

		if (age>18 && age<60 && income>25000)

		{

			System.out.println("person is eligible for a loan");

		}

		else 

		{

			System.out.println("person is not eligible for a loan");

		}

		

}

		



	}


