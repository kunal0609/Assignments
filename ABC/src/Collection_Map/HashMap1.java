package Collection_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("India", "Delhi");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    System.out.println("Iterating Hashmap...");  
	    for(Map.Entry m : capitalCities.entrySet()){    
	     System.out.println(m.getKey()+" "+m.getValue());    
	    }  
		
	}

}
