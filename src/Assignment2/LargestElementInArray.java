
//Q-2- Java Program to Find the Largest Element in an Array
package Assignment2;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89, 34, 56, 78, 90, 23, 54};

        int largest = findLargestElement(arr);

        System.out.println("The largest element in the array is: " + largest);
    }

    // Function to find the largest element in the array
    public static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
