package FlowControls;

import java.util.Scanner;

public class IfStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();

	    if (number > 0) {
	      System.out.println("The number is positive.");
	    }

	    System.out.println("Statement outside if block");

	}

}
