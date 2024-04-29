package listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// create an empty arrayList 
		
		//way-1
		//ArayList<className> refName=new ArrayList<>();
		
		ArrayList<Integer> arrayList=new ArrayList<>(); //empty ArrayList		
		LinkedList<Integer> linkedList=new LinkedList<>();//empty LinkedList		
		Vector<Character>   vc=new Vector<>();//empty Vector
		
		
		
		//way-2--- prefer this
		List<Integer> al=new ArrayList<>(); //empty ArrayList		
		List<Integer> ll=new LinkedList<>();//empty LinkedList		
		List<Character>   vc1=new Vector<>();//empty Vector
	}

}
