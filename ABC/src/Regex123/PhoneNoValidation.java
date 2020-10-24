package Regex123;

import java.util.Scanner;

public class PhoneNoValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	      System.out.println("Enter your Email: ");
	      
	      String phone = sc.next();
	      
	      String regex = "[7-9][0-9]{9}";
	      
	      //Matching the given email with regular expression
	      boolean result = phone.matches(regex);
	      if(result) {
	         System.out.println("Valid number");
	      } else {
	         System.out.println("Invalid number");
	      }
		
	}

}
