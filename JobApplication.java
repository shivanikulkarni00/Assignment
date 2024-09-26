//Assignment 5: Job Application
//Write a program that checks if a person is eligible for a job
//based on their qualifications.
//A person is eligible if they have a bachelor’s degree or equivalent
//experience, and they have a clean criminal record.
//Requirements:
//•    Use logical operators to combine conditions.
package Assignment1;
import java.util.Scanner;
public class JobApplication {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Person Qualification");
		System.out.println("Enter the Degree of person");
        String degree=sc.next();
        System.out.println("Enter the experience of person");
        int expe=sc.nextInt();
        System.out.println("Enter the ciminal record of person");
        boolean cr=sc.nextBoolean();
        if ((degree==("Btect") || degree==("BCA") || degree==("MCA") || degree==("B.COM") || degree==("M.COM")) && (expe>0) && (cr == false)) 
        {
        	System.out.println("Congragulations!!! you are eligible for a job"); 
        	}
        

     //  if(degree=="Btect"||degree=="BCA"||degree=="MCA"||degree=="B.COM"||degree=="M.COM")&&(expe>1)&&(cr==false)
       
    	  
       else
    	   System.out.println("Sorry!!! you are not eligible for a job"); 
	}

}
