package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hset = new HashSet<String>();

	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      hset.add("Apple");//Addition of duplicate elements
	      hset.add("Mango");
	      hset.add(null);//Addition of null values
	      hset.add(null);

	      //Displaying HashSet elements
	      Iterator<String> itr=hset.iterator();  
	      while(itr.hasNext()){  
	      System.out.println(itr.next());  
	      }  
		
	}

}
