package ThreadLocal123;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ThreadLocal<String> tlocal1 = new ThreadLocal<String>();  
        ThreadLocal<Number> tlocal2 = new ThreadLocal<Number>();  
   
        tlocal1.set("kunal");   
        System.out.println("Value: " + tlocal1.get());  
   
        tlocal2.set(100);   
        System.out.println("Value: " + tlocal2.get());  
    
        tlocal1.remove();   
        System.out.println("Value: " + tlocal1.get());  
  
        tlocal2.remove();  
        System.out.println("Value: " + tlocal2.get());  
        
	}

}
