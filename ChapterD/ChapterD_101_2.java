// 2. Define a class called ParkingLot with the following description:
// Data Members Purpose
// int vno To store the vehicle number
// int hours To store the number of hours the vehicle is parked in the parking lot
// double bill To store the bill amount
// Member Methods Purpose
// void input( ) To input the vno and hours
// void calculate( ) To compute the parking charge at the rate of Rs3 for the first
// hour or the part thereof and Rs1.50 for each additional hour or part thereof.
// void display() To display the detail
// Write a main method to create an object of the class and call the above methods

// package chapterd_101_2;

import java.util.Scanner;

public class ChapterD_101_2 {
    public static void main(String[] args) {
        ParkingLot obj = new ParkingLot();

        obj.input();
        obj.calculate();
        obj.display();
    }
}

class ParkingLot {
    String vno;
    int hours;
    double bill;

    void input() {
        Scanner gc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        vno = gc.nextLine();

        System.out.print("Enter number of hours parked: ");
        hours = gc.nextInt();
    }

    void calculate() {
        if (hours <= 1) {
            bill = 3;
        } else {
            bill = 3 + (hours - 1) * 1.5;
        }
    }

    void display() {
        System.out.println("\nParking Charges Bill :");
        System.out.println("Vehicle Number: " + vno);
        System.out.println("Number of hours parked: " + hours);
    }
}

/*
 * OUTPUT --
 * 
 * Enter vehicle number: JH10AQ1448
 * Enter number of hours parked: 5
 * 
 * Parking Charges Bill :
 * Vehicle Number: JH10AQ1448
 * Number of hours parked: 5
 */
