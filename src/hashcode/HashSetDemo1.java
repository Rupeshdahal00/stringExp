package hashcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// create an empty HashSet?????

		Set<Integer>   rc=new HashSet<>(); //<---Hash<Integer>   rc=new HashSet<>()
		
		//empty LinkedHashSet
		Set<String> ss=new LinkedHashSet<>();
		
		/*non empty linkedhashset
		Set<String> ss=new LinkedHashSet<>();
		ss.add('Apple');
		*/
		
		
		//empty TreeSet
		Set<Character>  ts=new TreeSet<>();
					    ts.add('m');
					    ts.add('m'); //duplicacy is not allowed
					    ts.add('d');
					    ts.add('f');
					    System.out.println(ts);
		
	}

}