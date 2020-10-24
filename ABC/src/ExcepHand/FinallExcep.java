package ExcepHand;

public class FinallExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		      int divideByZero = 5 / 0;
		    } catch (ArithmeticException e) {
		      System.out.println("ArithmeticException => " + e.getMessage());
		    } finally {
		      System.out.println("Finally block is always executed");
		    }
		
	}

}
