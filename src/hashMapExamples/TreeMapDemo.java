package hashMapExamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>  hm= new TreeMap<>();
		 hm.put(1, "Sagin"); //add elements 
		 hm.put(2, "Rajani");
		 hm.put(3, "Javed");
		 hm.put(4, "Javed"); //duplicacy is allowed only in value field
		 hm.put(5, "Spriha"); 
		// hm.put(null, "Suresh"); duplicacy is not allowed
		 hm.put(6, null); //null <--- we can pass only in value field
		
		 System.out.println(hm);	

	}

}
