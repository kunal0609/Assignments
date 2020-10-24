package Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Obj = new Scanner(System.in);

	    System.out.println("Enter the number:");

	    int number = Obj.nextInt();
		
		for(int i=1;i<=10;i++){  
	        System.out.println(number*i);  
	    } 
	}

}
