package Assignment1;

import java.util.Scanner;

public class Vote 
{
	public static void main(String[] args) {

		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);

System.out.println("\n Enter age and Country");

int age=sc.nextInt();

int country=sc.nextInt();

String Citizen="India";

if(age>=18 && Citizen.equals(country))

{

	System.out.println("Person is eligible for vote");

}

else 

{

	System.out.println("Person is not eligible for vote");

}

	}


}
