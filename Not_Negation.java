package Assignment1;

import java.util.Scanner;

public class Not_Negation 
{
	public static void main(String[] args) {

		// TODO Auto-generated method stub

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Number");

    int num=sc.nextInt();

    if(!(num>10 || num<20))

    {

    System.out.println("No is not between 10 to 20");	

    }

    else

    {

    	System.out.println("No is between 10 to 20");

    }

	}


}
