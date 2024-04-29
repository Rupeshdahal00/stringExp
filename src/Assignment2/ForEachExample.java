//Q-7- Java Program to Show Usage of forEach() Method

package Assignment2;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {1, 2, 3, 4, 5};

        // Using forEach to iterate over elements in the array
        System.out.println("Array elements:");
        Arrays.stream(numbers).forEach(num -> System.out.println(num));
    }
}
