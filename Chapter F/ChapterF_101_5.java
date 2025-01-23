/*
 * 5. Design a class Person the following specification
- zero-argument constructor
- One argument constructor
- two argument constructor
The Employee class inherits from the Person with the following specification
- zero-argument constructor
- One argument constructor, calls its parent’s single argument constructor
- two-argument constructor, it calls its parent’s double argument constructor
The Manager class inherits from Employee with the following specification
- zero-argument constructor
- One argument constructor, calls its parent’s single argument constructor
- two-argument constructor, it calls its parent’s double argument constructor
Create the Three objects of the Manager class with Zero, Single & Double
argument constructors and conclude the order of execution of different
constructors. 
 */

class Person {
    Person() {
        System.out.println("Person class zero-argument constructor called");
    }

    Person(String name) {
        System.out.println("Person class one-argument constructor called. Name: " + name);
    }

    Person(String name, int age) {
        System.out.println("Person class two-argument constructor called. Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    Employee() {
        System.out.println("Employee class zero-argument constructor called");
    }

    Employee(String name) {
        super(name);
        System.out.println("Employee class one-argument constructor called");
    }

    Employee(String name, int age) {
        super(name, age);
        System.out.println("Employee class two-argument constructor called");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager class zero-argument constructor called");
    }

    Manager(String name) {
        super(name);
        System.out.println("Manager class one-argument constructor called");
    }

    Manager(String name, int age) {
        super(name, age);
        System.out.println("Manager class two-argument constructor called");
    }
}

public class ChapterF_101_5 {
    public static void main(String[] args) {
        System.out.println("Creating Manager object with zero-argument constructor:");
        Manager manager1 = new Manager();

        System.out.println();

        System.out.println("Creating Manager object with one-argument constructor:");
        Manager manager2 = new Manager("Karan");

        System.out.println();

        System.out.println("Creating Manager object with two-argument constructor:");
        Manager manager3 = new Manager("Chandan", 22);
    }
}

/*
 * OUTPUT ---
 * 
 * Creating Manager object with zero-argument constructor:
 * Person class zero-argument constructor called
 * Employee class zero-argument constructor called
 * Manager class zero-argument constructor called
 * 
 * Creating Manager object with one-argument constructor:
 * Person class one-argument constructor called. Name: Karan
 * Employee class one-argument constructor called
 * Manager class one-argument constructor called
 * 
 * Creating Manager object with two-argument constructor:
 * Person class two-argument constructor called. Name: Chandan, Age: 22
 * Employee class two-argument constructor called
 * Manager class two-argument constructor called
 */