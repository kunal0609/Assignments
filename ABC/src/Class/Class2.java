package Class;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Obj = new Scanner(System.in);

	    System.out.println("Enter name, division, age:");

	    String name = Obj.nextLine();
	    int division = Obj.nextInt();
	    int age = Obj.nextInt();
	    

	    System.out.println("Name: " + name); 
	    System.out.println("Division: " +division); 
	    System.out.println("Age: " +age);
	    
	}

}
