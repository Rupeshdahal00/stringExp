//Q-14- Java Program to Print Left Triangle Star Pattern

package Assignment2;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
