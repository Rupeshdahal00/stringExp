//Q-3- Java Program to Sort an Array

package Assignment2;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89, 34, 56, 78, 90, 23, 54};

        System.out.println("Original Array:");
        printArray(arr);

        Arrays.sort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
