package ThreadPool123;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        
        for (int i = 1; i <= 5; i++) 
        {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());
 
            executor.execute(task);
        }
        executor.shutdown();
		
	}

}
