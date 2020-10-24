package Thread123;

public class ThreadInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    ThreadInterface obj = new ThreadInterface();
	    Thread thread = new Thread(obj);
	    thread.start();
	    System.out.println("This code is outside of the thread");
		
	}
	
	public void run() {
	    System.out.println("This code is running in a thread");
	  }

}
