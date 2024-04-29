//Question:01 - How to convert Integer to String in Java?
//Question:05 - Write a Java program to show user defined exception.


package Assesment1;

public class IntToString {
	public static void main(String[]args) {
	int number = 123;
	//String strNumber = String.valueOf(number);
	// OR
	String strNumber = "" + number;

	System.out.println("The converted string is: " + strNumber);

}
}