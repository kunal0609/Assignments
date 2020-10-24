package Thread123;

public class SleepTh extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SleepTh t1=new SleepTh();    
        SleepTh t2=new SleepTh();    
        t1.start();    
        t2.start();    
		
	}
	
	public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try  
            {  
                Thread.sleep(2000);  
            }catch(InterruptedException e)
            {
            	System.out.println(e);
            }
            
            System.out.println(i);
            
        }    
    }    

}
