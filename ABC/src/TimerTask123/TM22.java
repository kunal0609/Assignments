package TimerTask123;

import java.util.TimerTask;

public class TM22 extends TimerTask{

	public void run()
	{
        System.out.println("ReminderTask is completed by Java timer");
        
		//timer.cancel(); 
        
        System.exit(0);
    }
	
	public static void main(String args[]) {
		
        System.out.println("Java timer is about to start");
        
        TM11 reminder = new TM11(5);
        
        System.out.println("Remindertask is scheduled with Java timer.");
        
    }
	
}
