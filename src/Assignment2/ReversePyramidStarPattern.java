//Q-16- Java Program to Print Reverse Pyramid Star Pattern

package Assignment2;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop for the number of rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
