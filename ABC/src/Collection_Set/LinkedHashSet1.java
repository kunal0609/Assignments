package Collection_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  //Adding duplicates elements
		set.add("Ajay");  
		
		Iterator<String> itr=set.iterator();  
		
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
	}

}
