package String_builder;

public class SBE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1=new StringBuilder("Hello ");
		StringBuilder sb2=new StringBuilder("Kunal ");
		StringBuilder sb3=new StringBuilder("Hello Kunal Jadhav");
		StringBuilder sb4=new StringBuilder("Hello Kunal Jadhav");
		StringBuilder sb5=new StringBuilder("Developer");  
		
		sb1.append("Java");  
		System.out.println(sb1);
		
		sb2.insert(1,"Java");
		System.out.println(sb2);
		
		sb3.replace(6,11,"Rahul");  
		System.out.println(sb3);
		
		
		sb4.delete(6,11);
		System.out.println(sb4);
		
		sb5.reverse();  
		System.out.println(sb5);
		
		StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Welcome to our home");  
		System.out.println(sb.capacity());//now (oldcapacity*2)+2  
		
	}

}
