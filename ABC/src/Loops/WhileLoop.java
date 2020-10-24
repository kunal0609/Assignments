package Loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Obj = new Scanner(System.in);

	    System.out.println("Enter the number:");

	    int number = Obj.nextInt();
		
		int i=1, sum=0;  
	    while(i<=10){  
	        System.out.println(number*i); 
	        sum = sum + (number*i);
	        i++;  
	    }  
	    System.out.println("Addition of all elements in table:"+sum); 
	}

}
