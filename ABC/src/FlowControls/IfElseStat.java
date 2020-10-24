package FlowControls;

import java.util.Scanner;

public class IfElseStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println("Enter an Integer number:");
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	    
	}

}
