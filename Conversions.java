/*Name : Satya Rohit
Student Id : A0024584
This Program is regarding the Jav1001-Lab1
*/
package com.conversion.cambrian;

import java.util.Scanner;



public class Conversions {

	public static void main(String[] args) {
		
		boolean loop=true;
		
		while(loop=true)
		{
		System.out.println("\nEnter your expression\n"); //Asking the input from the user
		
		System.out.println(" 1: Kms to Mi\n 2: Mi to Kms\n 3: Cms to in\n 4: In to Cms\n 5: Kgs to Lbs\n 6: Lbs to Kgs\n 7: Exit \n"); //Giving the options to User to select one 
		
		Scanner sc = new  Scanner(System.in);          //This is used to take the input from the keyboard from the user
		int expression = sc.nextInt();                // Storing the input given from the user to a variable
		
		
		// Using the Switch expression to select the Option 
		switch(expression) {
		
		case 1:
			System.out.println("Enter your Kms to convert it into Mi \n");
			int Kms_value=sc.nextInt();
			double final_result=Kms_value*0.62;
			System.out.println(Kms_value + " km = " + final_result + " miles");
			
			break;
		
		case 2:
			
			System.out.println("Enter your Mi to convert it into Kms \n");
			int Mi_value=sc.nextInt();
			double final_result1=Mi_value*1.61;
			System.out.println(Mi_value + " Mi = " + final_result1 + " Kms");
		
			
			break;
			
			
		case 3:
			
			System.out.println("Enter your Cm to convert it into In \n");
			int Cm_value=sc.nextInt();
			double final_=Cm_value*0.39;
			System.out.println(Cm_value + " Cm = " + final_ + " In");
			
			
			break;
			
			
		case 4:
			
			System.out.println("Enter your In to convert it into Cms \n");
			int In_value=sc.nextInt();
			double final_1=In_value*2.54;
			System.out.println(In_value + " Cm = " + final_1 + " In");
			
			
			break;
			
			
		case 5:
			
			System.out.println("Enter your Kgs to convert it into lbs\n");
			int Kgs_value=sc.nextInt();
			double final_2=Kgs_value*2.2;
			System.out.println(Kgs_value + " Kg = " + final_2 + " Lb");
			break;
			
		case 6:
			System.out.println("Enter your Lbs to convert it into Kms\n");
			int Lbs_value=sc.nextInt();
			double final_Lbs=Lbs_value*2.2;
			System.out.println(Lbs_value + " Kg = " + final_Lbs + " Lb");
			break;
			
		case 7:
			
			// Using this case to iterate the while loop
			
			System.out.println("Your Applicatin is Closed...Thank You\n");
			loop=false;
			break;
			
			default:
				// This default is used when the user enters other than the given option
				System.out.println("Entered Option is not from the given list, please try again.........\n");
				break;
		
		}
		sc.close();
		}
		

	}

}
