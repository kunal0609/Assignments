package JUnitExample1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assert1 {
	@Test
	public void testAssertions() {

		String str = new String("Kunal");
		String str1 = new String("Kunal");
		
		String str2 = null;
		
		String str3 = "Kunal";
		String str4 = "Kunal";
		
		int val = 6;
		int val1 = 7;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		//check for equal
		assertEquals(str, str1);
		
		//check for true
		assertTrue(val<val1);
		
		//check for false
		assertFalse(val<val1);
		
		//check for null
		assertNotNull(str);
		
		//check if it is null
		assertNull(str2);
		
		//check if the reference is to the same object
		assertSame(str3, str4);
		
		}
	
}
