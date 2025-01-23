/*
2. Follow the following code and write a program to show that ‘super’ keyword is used to access the super class data member (maxSpeed).

    //Base class vehicle 
        class Vehicle
        {
            int maxSpeed = 100;
        }
    //sub class Car extending vehicle 
        class Car extends Vehicle
        {
            int maxSpeed = 140;
            void display(){ ..... }
        }
    // Expected Output:
    // My parent’s speed was : 100 KM/H
    // My Speed is : 140 KM/H
*/

class Vehicle {
    int maxSpeed = 100;
}

class Car extends Vehicle {
    int maxSpeed = 140;

    void display() {
        System.out.println("My parent's speed was : " + super.maxSpeed + " KM/H");
        System.out.println("My Speed is : " + this.maxSpeed + " KM/H");
    }
}

public class ChapterG_101_2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
    }
}

/*
 * OUTPUT ---
 * 
 * My parent's speed was : 100 KM/H
 * My Speed is : 140 KM/H
 */
