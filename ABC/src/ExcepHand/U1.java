package ExcepHand;

public class U1 extends Exception{
	
		public U1()
		 {
		     System.out.println("Balance is low");
		 }
		 
		 public static void main(String[] args) {
		 
		        try{
		 
		           int acc[] = {100,101,102,103,104,105};       
		 
		           double balance[]={900,2000,1500,1600,1700};
		 
		           System.out.println("Account No\t"+"Balance\t");
		 
		           for (int i=0;i<5;i++)
		           {
		               System.out.println(acc[i]+"\t"+balance[i]+"\t");
		 
		               if(balance[i]<1000)
		 
		               {
		                   throw new U1();  //throwing user defined exception
		               }
		           }
		        }catch(U1 e)
		        {
		        	System.out.println("Exception caught");      
		        }
	}
}
