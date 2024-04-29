//Q-4- Java Program to Sort the Elements of an Array in Descending Order

package Assignment2;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortingDescending {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89, 34, 56, 78, 90, 23, 54};

        System.out.println("Original Array:");
        printArray(arr);

        // Sort array in descending order
        Arrays.sort(arr);
        reverseArray(arr);

        System.out.println("\nSorted Array (Descending Order):");
        printArray(arr);
    }

    // Utility method to reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
