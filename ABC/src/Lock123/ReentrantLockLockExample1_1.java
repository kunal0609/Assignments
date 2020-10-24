package Lock123;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockLockExample1_1 {

	 static final int MAX_Time = 2;   
	  public static void main(String[] args)   
	  {   
	    ReentrantLock rel = new ReentrantLock();   
	    ExecutorService pool = Executors.newFixedThreadPool(MAX_Time);   
	    Runnable wrk1 = new WorkerClassLL(rel, "Job1");   
	    pool.execute(wrk1);   
	    pool.shutdown();   
	  }   
	
}
