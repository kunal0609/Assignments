package Lock123;

import java.util.concurrent.locks.ReentrantLock;

public class WorkerClassLL implements Runnable{

	String nm;   
	  ReentrantLock relc;   
	  public WorkerClassLL(ReentrantLock rl, String n)   
	  {   
	    relc = rl;   
	    nm = n;   
	  }   
	  public void run()   
	  {   
	    boolean dn = false;   
	    while (!dn)   
	    {   
	      //Outer Lock   
	      boolean ans = relc.tryLock();   
	    
	      //  True if lock is free   
	      if(ans)   
	      {   
	        try  
	        {   
	          int i=0;  
	          for(i=0;i<=6;i++) {  
	                
	              if(i>=2)  
	              {  
	                  relc.lock();  
	                  Thread t = new Thread();  
	                  System.out.println("Thread Created.....");  
	                  if(i==3) {  
	                      t.setName("Maint Thread2");  
	                      System.out.println("Thread Created.....");  
	                  }  
	                  
	                    
	              }  
	              if(i==4)  
	                  relc.unlock();  
	                  break;  
	                
	          }  
	            
	          System.out.println(" after sleep Is locked - " + relc.isLocked());   
	          System.out.println("task name - " + nm + " work done");   
	    
	          dn = true;   
	        }   
	        catch(Exception e)   
	        {   
	          e.printStackTrace();   
	        }   
	          
	      }   
	        
	      }   
	    }  
	
}
