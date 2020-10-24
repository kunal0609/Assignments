package TimerTask123;

import java.util.Timer;

public class TM11 {

	Timer timer;

    public TM11 (int seconds) 
    {
        timer = new Timer();  
        
        timer.schedule(new TM22(), seconds*1000); 

    }
	
}
