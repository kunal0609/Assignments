package ThreadLocal123;

public class T1 {

	public static void main(String[] args) {
		
		ThreadLocal<Integer> tlocal1 = new ThreadLocal<Integer>();     
    
        tlocal1.set(80);  
        System.out.println("Value: " + tlocal1.get());  
   
        tlocal1.set(200);  
        System.out.println("Value: " + tlocal1.get());  
		
	}
	
}
