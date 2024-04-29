//Q-6- Java Program to Show Use of Static and Non-static Methods

package Assignment2;

public class MethodExample {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Calling static method
        staticMethod();

        // Creating an object of the class to call non-static method
        MethodExample obj = new MethodExample();
        obj.nonStaticMethod();
    }
}
