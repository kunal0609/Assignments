package Regex123;

import java.util.Scanner;

public class EmailValidation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  Scanner sc = new Scanner(System.in);
		
	      System.out.println("Enter your Email: ");
	      
	      String email = sc.next();
	      
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      
	      //Matching the given email with regular expression
	      boolean result = email.matches(regex);
	      if(result) {
	         System.out.println("Given email-id is valid");
	      } else {
	         System.out.println("Given email-id is not valid");
	      }
		
	}

}
