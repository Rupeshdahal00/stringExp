//Q-12- Java Program to Show Inheritance in Class....

package Assignment2;

//Parent class (superclass)
class Animal {
 public void eat() {
     System.out.println("Animal is eating...");
 }
}

//Child class (subclass) inheriting from Animal
class Dog extends Animal {
 public void bark() {
     System.out.println("Dog is barking...");
 }
}


