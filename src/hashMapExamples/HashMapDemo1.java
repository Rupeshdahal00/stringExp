package hashMapExamples;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// Empty HashMap 
		
		// HashMap<key,value>     hm= new HashMap<>();
		
		Map<Integer,String>  hm= new HashMap<>();
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