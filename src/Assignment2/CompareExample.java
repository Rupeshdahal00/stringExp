//Q-10- Java Program to Show Usage of compare() Method

package Assignment2;

import java.util.Comparator;

public class CompareExample {
    public static void main(String[] args) {
        // Creating a Comparator to compare integers in descending order
        Comparator<Integer> comparator = (num1, num2) -> num2 - num1;

        // Comparing two integers using the compare() method
        int result = comparator.compare(5, 10);

        // Printing the result
        if (result < 0) {
            System.out.println("5 is less than 10");
        } else if (result > 0) {
            System.out.println("5 is greater than 10");
        } else {
            System.out.println("5 is equal to 10");
        }
    }
}
