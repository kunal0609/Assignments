package Wrapper;

public class wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=30;  
		char c='a';  
		
		//AutoB
		
		Integer intobj=i;  
		Character charobj=c;  
		
		//print
		
		System.out.println("Integer object: "+intobj);  
		System.out.println("Character object: "+charobj);  
		
		//UnB
		
		int intvalue=intobj;
		char charvalue=charobj;  
		
		//print
		
		System.out.println("int value: "+intvalue);  
		System.out.println("char value: "+charvalue);  
		
	}

}
