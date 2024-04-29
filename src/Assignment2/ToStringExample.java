//Q-8- Java Program to Show Usage of toString() Method

package Assignment2;

public class ToStringExample {
    int id;
    String name;

    // Constructor
    public ToStringExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString() method override
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        // Creating an object of ToStringExample class
        ToStringExample obj = new ToStringExample(1, "John");

        // Printing the object
        System.out.println(obj);
    }
}
