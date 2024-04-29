//Question:02 - How to reverse a String in Java?
package Assesment1;
public class ReverseString {
    public static void main(String[] args) {
        String original = "Rajani";
        String reversed = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}