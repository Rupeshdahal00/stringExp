package collectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitMain {

	public static void main(String[] args) {
		List<Mobile>  listOfFruits=new ArrayList<>();
		
		
		Mobile fr=new Mobile(120,"Apple","White");
		Mobile fr2=new Mobile(70,"Motorola","Blue");
		Mobile fr3=new Mobile(90,"Nokia","Black");
		Mobile fr4=new Mobile(120,"Apple","White");
		listOfFruits.add(fr);
		listOfFruits.add(fr2); 
		listOfFruits.add(fr3); 
		listOfFruits.add(fr4); 
		
		System.out.println(listOfFruits);
		System.out.println("------sort the data-----------");
		//sort
		Collections.sort(listOfFruits);
		System.out.println(listOfFruits);
		System.out.println("------sort the data on name basis-----------");
		Collections.sort(listOfFruits,new SortingDataOnNamebasis());
		System.out.println(listOfFruits);
	}

}
