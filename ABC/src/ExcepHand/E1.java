package ExcepHand;

public class E1 {
	
	public int[] arrayOfNumbers = new int[10];

	  public void ArrayElementFilling() {

	    try {
	      arrayOfNumbers[10] = 11;
	      
	    }  catch (IndexOutOfBoundsException e2) {
	      System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
	    }

	 }
	
}
