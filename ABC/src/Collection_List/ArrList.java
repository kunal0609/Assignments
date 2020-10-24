package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
		list.add("Ravi");//Add objects 
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		System.out.println("Newly created list : ");
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
		list.remove(0);
		list.remove("Vijay");
		
		System.out.println("List after remove operation : ");
		
		Iterator itr1=list.iterator();  
		
		while(itr1.hasNext())
		{  
			System.out.println(itr1.next());  
		}
		
	}

}
