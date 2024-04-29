//Q-11- Java Program to Show Encapsulation in Class

package Assignment2;

public class EncapsulationExampleForPerson {

	    private String name;

	    public EncapsulationExampleForPerson(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	    	EncapsulationExampleForPerson person = new EncapsulationExampleForPerson("Rajani");
	        System.out.println("Name: " + person.getName());
	    }
	}
