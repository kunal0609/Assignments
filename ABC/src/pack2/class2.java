package pack2;

import pack1.classA;

public class class2 {
	
	public static void main(String[] args) {
	
	   classA obj=new classA(); 
	
	   System.out.println(obj.data); //Compile Time Error  
	   
	   obj.msg(); //Compile Time Error  
	}
}
