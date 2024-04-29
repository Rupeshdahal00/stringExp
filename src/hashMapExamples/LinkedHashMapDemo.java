package hashMapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>  hm= new LinkedHashMap<>();
		 hm.put(1, "Sagin"); //add elements 
		 hm.put(2, "Rajani");
		 hm.put(3, "Javed");
		 hm.put(4, "Javed"); //duplicacy is allowed only in value field
		 hm.put(2, "Spriha"); //duplicacy is not allowed in Key field
		 hm.put(null, "Suresh"); 
		 hm.put(5, null);
		
		 System.out.println(hm);	
		
		
		
	}

}
