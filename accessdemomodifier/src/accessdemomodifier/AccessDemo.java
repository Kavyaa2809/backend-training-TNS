// File: AccessDemo.java
package accessdemomodifier;

// Base class with members having different access modifiers
class Person {
    public String name = "Kavya";          // public → accessible everywhere
    private int age = 21;                  // private → accessible only in this class
    protected String city = "Hyderabad";   // protected → accessible in same package & subclasses
    String country = "India";              // default (no modifier) → accessible only in same package

    // Public method can access private members
    public void showDetails() {
        System.out.println("Name (public): " + name);
        System.out.println("Age (private): " + age);
        System.out.println("City (protected): " + city);
        System.out.println("Country (default): " + country);
    }
}

// Subclass in the same package
class Student extends Person {
    public void display() {
        System.out.println("Accessing from subclass:");
        System.out.println("Name: " + name);     // public → accessible
        // System.out.println("Age: " + age);    // private → NOT accessible
        System.out.println("City: " + city);     // protected → accessible
        System.out.println("Country: " + country); // default → accessible in same package
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.showDetails();   // Access via public method

        Student s = new Student();
        s.display();
    }
}
		
		
	

	

	
