// Create a class Animal. Create also other two classes Tiger & Cat which are direct sub class of Animal class. Write all the necessary methods, constructors of all the classes to implement dynamic method dispatching.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger roars");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class A3AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Tiger();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}

// OUTPUT ---
// Tiger roars
// Cat meows