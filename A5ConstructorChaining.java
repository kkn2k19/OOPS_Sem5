// Write a program to implement, constructor chaining using 'this' keyword and constructor chaining using 'super' keyword. Write the necessary classes.

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        this(10);
        System.out.println("Child default constructor");
    }

    Child(int x) {
        super();
        System.out.println("Child parameterized constructor: " + x);
    }
}

public class A5ConstructorChaining {
    public static void main(String[] args) {
        new Child();
    }
}

// OUTPUT ---
// Parent constructor
// Child parameterized constructor: 10
// Child default constructor