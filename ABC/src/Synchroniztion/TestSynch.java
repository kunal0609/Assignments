package Synchroniztion;

public class TestSynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table obj = new Table();
		
		MyThread1 t1=new MyThread1(obj);  
		
		MyThread2 t2=new MyThread2(obj);  
		
		t1.start();  
		
		t2.start();  
		
	}

}