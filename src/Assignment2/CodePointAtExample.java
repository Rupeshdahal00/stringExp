//Q-9- Java Program to Show Usage of codePointAt() Method

package Assignment2;

public class CodePointAtExample {
    public static void main(String[] args) {
        // Sample string
        String str = "Hello";

        // Using codePointAt() to get the Unicode code point value of the character at index 1
        int codePoint = str.codePointAt(1);

        // Printing the result
        System.out.println("Unicode code point value of character at index 1: " + codePoint);
    }
}
