/*Name : Satya Rohit
Student Id : A0024584
This Program is regarding the Jav1001-Lab1
*/
package com.conversion.cambrian;

import java.util.Scanner;



public class Conversions {

	public static void main(String[] args)  {
		
		boolean loop=true;
		
		while(loop!=false) // this is to iterate the loop for asking the inputs again....
		{
		System.out.println("\nEnter your expression\n"); //Asking the input from the user
		
		System.out.println(" KM: Kms to Mi\n MI: Mi to Kms\n CM: Cms to in\n IN: In to Cms\n KG: Kgs to Lbs\n LB: Lbs to Kgs\n E: Exit \n"); //Giving the options to User to select one 
		
		Scanner sc = new  Scanner(System.in);          //This is used to take the input from the keyboard from the user
		String expression = sc.next();                // Storing the input given from the user to a variable
		
		
		// Using the Switch expression to select the Option 
		switch(expression) {
		
		case "KM":
			System.out.println("Enter your Kms to convert it into Mi \n");
			double Kms_value=sc.nextDouble();
			double final_result=Kms_value*0.62;
			System.out.println(Kms_value + " km = " + final_result + " miles");
			
			break;
		
		case "MI":
			
			System.out.println("Enter your Mi to convert it into Kms \n");
			double Mi_value=sc.nextDouble();
			double final_result1=Mi_value*1.61;
			System.out.println(Mi_value + " Mi = " + final_result1 + " Kms");
		
			
			break;
			
			
		case "CM":
			
			System.out.println("Enter your Cm to convert it into In \n");
			double Cm_value=sc.nextDouble();
			double final_=Cm_value*0.39;
			System.out.println(Cm_value + " Cm = " + final_ + " In");
			
			
			break;
			
			
		case "IN":
			
			System.out.println("Enter your In to convert it into Cms \n");
			double In_value=sc.nextDouble();
			double final_1=In_value*2.54;
			System.out.println(In_value + " Cm = " + final_1 + " In");
			
			
			break;
			
			
		case "KG":
			
			System.out.println("Enter your Kgs to convert it into lbs\n");
			double Kgs_value=sc.nextDouble();
			double final_2=Kgs_value*2.2;
			System.out.println(Kgs_value + " Kg = " + final_2 + " Lb");
			break;
			
		case "LB":
			System.out.println("Enter your Lbs to convert it into Kms\n");
			double Lbs_value=sc.nextDouble();
			double final_Lbs=Lbs_value*2.2;
			System.out.println(Lbs_value + " Kg = " + final_Lbs + " Lb");
			break;
			
		case "E":
			
			// Using this case to iterate the while loop
			
			System.out.println("Your Application is Closed...Thank You.... :) \n"); 
			loop=false;
		
			
			   sc.close(); //Closing the Scanner class
			 
			break;
			
			default:
				// This default is used when the user enters other than the given option
				System.out.println("Entered Option is not from the given list, please try again.........\n");
				
				break;
		
		}
	
		}
		

	}

}
