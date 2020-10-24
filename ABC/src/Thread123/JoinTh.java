package Thread123;

public class JoinTh implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1 = new Thread(new JoinTh(), "th1");
	      Thread th2 = new Thread(new JoinTh(), "th2");
	      Thread th3 = new Thread(new JoinTh(), "th3");
	         
	      // Start first thread immediately
	      th1.start();
	         
	      /* Start second thread(th2) once first thread(th1) 
	       * is dead
	       */
	      try {
	          th1.join();
	      } catch (InterruptedException ie) {
	          ie.printStackTrace();
	        }
	      th2.start();
	         
	      /* Start third thread(th3) once second thread(th2) 
	       * is dead
	       */
	      try {
	          th2.join();
	      } catch (InterruptedException ie) {
	           ie.printStackTrace();
	        }
	      th3.start();
	         
	      // Displaying a message once third thread is dead
	      try {
	          th3.join();
	      } catch (InterruptedException ie) {
	            ie.printStackTrace();
	        }  
	      System.out.println("All three threads have finished execution");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
        System.out.println("Thread started: "+t.getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: "+t.getName());
        
	}

}
