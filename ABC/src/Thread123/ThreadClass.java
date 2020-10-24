package Thread123;

public class ThreadClass extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadClass thread = new ThreadClass();
		
	    thread.start();
	    
	    System.out.println("This code is outside of the thread");	
	}
	
	public void run() {
	    System.out.println("This code is running in a thread");
	  }

}
