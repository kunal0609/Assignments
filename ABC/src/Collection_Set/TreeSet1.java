package Collection_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set=new TreeSet<String>();  
		
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
	}

}
