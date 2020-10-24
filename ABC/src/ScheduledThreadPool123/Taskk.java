package ScheduledThreadPool123;

import java.util.Date;

public class Taskk implements Runnable{

	private String name;
	 
    public Taskk(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
    }
	
}
