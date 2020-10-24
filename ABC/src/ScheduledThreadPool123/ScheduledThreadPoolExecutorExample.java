package ScheduledThreadPool123;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
        
        Taskk task = new Taskk("Repeat Task");
        System.out.println("Created : " + task.getName());
         
        executor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
		
	}

}
