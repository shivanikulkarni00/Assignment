

	//Assignment 2: Exam Grading System

	//Write a program that determines whether a student passes an exam based on three subjects. 

	//A student passes if the average score is at least 60, and none of the individual scores is

	//below 40.

	//Requirements:

	//•    Use logical operators && and || to combine conditions.

	package Assignment1;



	import java.util.Scanner;



	public class Exam {



		public static void main(String[] args) {

			

			Scanner sc=new Scanner(System.in);

			System.out.println("enter the subject1 marks");

			int s1=sc.nextInt();

			System.out.println("enter the subject2 marks");

			int s2=sc.nextInt();

			System.out.println("enter the subject3 marks");

			int s3=sc.nextInt();

			double avg=(s1+s2+s3)/3;

			if (avg>=60&& s1>40&&s2>40&&s3>40)

			{

				System.out.println("Student pass the exam based on three subject ");

				

			}

			else

				System.out.println(" Sorry.....Student failed");

		}



	}

