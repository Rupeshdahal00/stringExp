package listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// create an empty arrayList 
		
		
		List<Integer> al=new ArrayList<>(); //empty ArrayList	
		//add elements in an empty array   ---->add()
					al.add(34);
					al.add(10);
					al.add(10);//duplicacy is allowed
					al.add(45);
					al.add(78);
					al.add(34);
				//	al.add("Rajani");  not allowed 
			
					System.out.println(al);
					
					
		List<Character> al2=new ArrayList<>(); //empty ArrayList
						al2.add('p');
					//	al2.add("Rajani"); not allowed
						al2.add('x');
						al2.add('b');
						al2.add('r');
						al2.add('t');
						System.out.println(al2);
						
	}

}
