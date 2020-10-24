package ExcepHand;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");  
		        InputStream input = new FileInputStream("abc.txt"))
		{  
		        //Code to write data into file  
		        String msg = "Welcome";      
		        byte byteArray[] = msg.getBytes();  // Converting string into byte array      
		        fileOutputStream.write(byteArray);  // Writing  data into file  
		        System.out.println("Data written into file");  
		        System.out.println(msg); 
		        
		        //Code to read data from file   
		        DataInputStream inst = new DataInputStream(input);    
		        int data = input.available();    
		         
		        byte[] byteArray2 = new byte[data];     
		        inst.read(byteArray2);    
		        String str = new String(byteArray2);  
		        System.out.println("Data read from file");  
		        System.out.println(str);  
		        
		}catch(Exception exception){  
		       System.out.println(exception);  
		}          
	}

}

