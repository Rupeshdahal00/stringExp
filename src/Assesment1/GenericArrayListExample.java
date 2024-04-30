//Question:04 - Create a genric ArrayList with few element , access it and print size of the list.
package Assesment1;

import java.util.ArrayList;

//done in develop branch

public class GenericArrayListExample {
    public static void main(String[] args) {
        // Create a generic ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Access elements in the ArrayList and print them
        System.out.println("Elements in the ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }

        // Print the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());
    }
}
