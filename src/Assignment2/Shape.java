//Q-13- Java Program to Show Abstraction in Class...........

package Assignment2;

//Abstract class
abstract class Shape {
 // Abstract method (no implementation)
 public abstract void draw();
}

//Concrete subclass of Shape
class Circle extends Shape {
 // Implementation of the abstract method
 @Override
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}


