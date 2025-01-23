/*
 * 4. Design a class Animal with the following specification
        - sound(), it prints “Sound of Animals, which varies” 
    class Dog is inherited from Animal class with the following specification
        - sound(), it prints “Barking” 
    class Tiger is inherited from Animal class with the following specification
        - sound(), it prints “Roaring”
With the help of these classes show the concept of Dynamic Method Dispatching.[If the user gives D then it will print “Barking” , T then it will print “Roaring” else Exit from the program]
*/

import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Sound of Animals, which varies");
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

public class ChapterG_101_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;

        System.out.println("Enter D for Dog, T for Tiger, or any other key to Exit:");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'D':
            case 'd':
                animal = new Dog();
                break;
            case 'T':
            case 't':
                animal = new Tiger();
                break;
            default:
                System.out.println("Exiting...");
                return;
        }

        animal.sound();
    }
}

/*
 * OUTPUT (1)---
 * 
 * Enter D for Dog, T for Tiger, or any other key to Exit:
 * d
 * Barking
 */

/*
 * OUTPUT (2)---
 * 
 * Enter D for Dog, T for Tiger, or any other key to Exit:
 * t
 * Roaring
 */

/*
 * OUTPUT (3)---
 * 
 * Enter D for Dog, T for Tiger, or any other key to Exit:
 * D
 * Barking
 */

/*
 * OUTPUT (4)---
 * 
 * Enter D for Dog, T for Tiger, or any other key to Exit:
 * T
 * Roaring
 */