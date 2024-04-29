//Q-1- Java Program to Search an Element in an Array


package Assignment2;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89, 34, 56, 78, 90, 23, 54};

        int searchElement = 56;

        int index = linearSearch(arr, searchElement);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Function to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // Return -1 if element not found
    }
}


