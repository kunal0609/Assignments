package Collection_Queue;

import java.util.PriorityQueue;

public class PriorQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

        // Add items to a Priority Queue 
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue 
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }

		
	}

}
