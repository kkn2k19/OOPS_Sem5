/*
 * 1. Design a class Animal with the following specification
- sound(), it prints “Sound of Animals, which varies”
- hasLife(), it returns True
- hasTail(), it returns True
- noOfEyes(), it return 2
- noOfLegs(), it return 4
Design another class Dog which is inherited from Animal class with the following
specification
- sound(), it prints “Barking”
Design another class Tiger which is inherited from the Animal class with the
following specification
- sound(), it prints “Roaring”
Create the Object of Dog & Tiger and the necessary methods to illustrate the
concept of Method overriding. 
 */

class Animal {
    void sound() {
        System.out.println("Sound of Animals, which varies");
    }

    boolean hasLife() {
        return true;
    }

    boolean hasTail() {
        return true;
    }

    int noOfEyes() {
        return 2;
    }

    int noOfLegs() {
        return 4;
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barking");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Roaring");
    }
}

public class ChapterG_101_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        System.out.print("Dog sound:");
        dog.sound();

        System.out.print("Tiger sound:");
        tiger.sound();

        System.out.println("Dog has life: " + dog.hasLife());
        System.out.println("Tiger has tail: " + tiger.hasTail());
        System.out.println("Dog has " + dog.noOfEyes() + " eyes.");
        System.out.println("Tiger has " + tiger.noOfLegs() + " legs.");
    }
}

/*
 * OUTPUT ---
 * 
 * Dog sound:Barking
 * Tiger sound:Roaring
 * Dog has life: true
 * Tiger has tail: true
 * Dog has 2 eyes.
 * Tiger has 4 legs.
 */