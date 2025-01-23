/*
 1. Create a class Parent with a method that prints "This is parent class" and its subclass Child with another method that prints "This is child class". Now, create an object for each of the classes and call
    1 - method of parent class by the object of the Parent class
    2 - method of child class by the object of Child class
    3 - method of parent class by the object of Child class 
 */

class Parent {
    void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is child class");
    }
}

public class ChapterF_101_1 {
    public static void main(String[] args) {
        Parent parentObject = new Parent();
        parentObject.displayParent();

        Child childObject = new Child();
        childObject.displayChild();

        childObject.displayParent();
    }
}

/*
 * OUTPUT ---
 * 
 * This is parent class
 * This is child class
 * This is parent class
 */