//Q-12- Java Program to Show Inheritance in Class...........CONTINUED

package Assignment2;

public class InheritanceExample {
	 public static void main(String[] args) {
	     // Creating an object of Dog class
	     Dog dog = new Dog();

	     // Calling methods of both Animal and Dog class
	     dog.eat(); // Inherited from Animal class
	     dog.bark(); // Defined in Dog class
	 }
	}
