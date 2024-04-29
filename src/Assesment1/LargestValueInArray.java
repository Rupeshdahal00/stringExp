//Question:03 - How To Find The Largest Value From The Given Array?
package Assesment1;

public class LargestValueInArray {
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 50, 40}; // Example array

        int largest = array[0]; // Assume the first element is the largest

        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if current element is greater
            }
        }

        System.out.println("The largest value in the array is: " + largest);
    }
}