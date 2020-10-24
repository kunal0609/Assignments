package Collection_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> dq = new ArrayDeque<String>();
	    
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daryl");
		    
		System.out.println("Elements in Deque:"+dq);
		
		System.out.println("Removed element: "+dq.removeLast());
		    
		System.out.println("Head: "+dq.element());
		    
		System.out.println("poll(): "+dq.pollLast());
		    
		System.out.println("peek(): "+dq.peek());
		    
		//Again printing the elements of Deque
		System.out.println("Elements in Deque:"+dq);
		
	}

}
