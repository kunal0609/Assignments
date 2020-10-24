package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list=new LinkedList<String>();//Creating linkedlist  
		
		list.add("Kunal");//Add objects 
		list.add("Rahul");  
		list.add("Ravi");  
		list.add("Ram");  
		
		System.out.println("Newly created LinkedList : ");
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
		list.remove(1);
		list.remove("Ravi");
		
		System.out.println("List after remove operation : ");
		
		Iterator itr1=list.iterator();  
		
		while(itr1.hasNext())
		{  
			System.out.println(itr1.next());  
		}
		
	}

}
