package ternery;

import java.util.Scanner;

public class ABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your marks: ");
	    double marks = sc.nextDouble();
	    String result = (marks > 40) ? "pass" : "fail";

	    System.out.println("You " + result + " the exam.");
	    
	}

}
