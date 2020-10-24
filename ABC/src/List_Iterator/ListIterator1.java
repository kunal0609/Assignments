package List_Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListIterator<String> litr = null;
	    ArrayList<String> names = new ArrayList<String>();
	    names.add("Shyam");
	    names.add("Rajat");
	    names.add("Paul");
	    names.add("Tom");
	    names.add("Kate");
	    
	    litr=names.listIterator();
	 
	    System.out.println("Traversing the list in forward direction:");
	    while(litr.hasNext()){
	       System.out.println(litr.next());
	    }
	    System.out.println("\nTraversing the list in backward direction:");
	    while(litr.hasPrevious()){
	       System.out.println(litr.previous());
	    }
		
	}

}
