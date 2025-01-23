// 1. Design a class RailwayTicket with the following description:
// Data Members Purpose
// String name : To store the name of the customer
// String coach : To store the type of coach the customer wants to travel
// long mobno : To store the customer's mobile number
// int amt : To store the basic amount of ticket
// int totalamt : To store the amount to be paid after updating the original amount
// Member Methods Purpose
// void accept() : To take input for name, coach, mobile number, and amount
// void update() : To update the amount as per the coach selected (extra amount
// to be added in the amount as per the table below)
// void display() : To display all details of a customer such as a name, coach, total
// amount, and mobile number
// Type of Coaches Amount
//  First_AC 700
//  Second_AC 500
//  Third_AC 250
//  Sleeper None
// Write a main method to create an object of the class and call the above member
// methods. 

// package chapterd_101_1;

import java.util.Scanner;

public class ChapterD_101_1 {
    public static void main(String[] args) {
        RailwayTicket ticket = new RailwayTicket();
        ticket.accept();
        ticket.update();
        ticket.display();
    }
}

class RailwayTicket {
    String name;
    String coach;
    long mobno;
    int basicAmt;
    int totalAmt;

    void accept() {
        Scanner gc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = gc.nextLine();

        System.out.print("Enter your coach : ");
        coach = gc.nextLine();

        System.out.print("Enter your mobile number : ");
        mobno = gc.nextLong();

        System.out.print("Enter the basic amount of ticket : ");
        basicAmt = gc.nextInt();
    }

    void update() {
        int coachAmt = 0;
        switch (coach) {
            case "First_AC":
                coachAmt = 700;
                break;
            case "Second_AC":
                coachAmt = 500;
                break;
            case "Third_AC":
                coachAmt = 250;
                break;
            case "Sleeper":
                coachAmt = 0;
                break;
            default:
                System.out.println("Invalid coach type. No update to amount.");
                coachAmt = 0;
                break;
        }
        totalAmt = basicAmt + coachAmt;
    }

    void display() {
        System.out.println("\nTicket details : ");
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Basic Amount: " + basicAmt);
        System.out.println("Total Amount: " + totalAmt);
    }
}

/*
 * OUTPUT --
 * 
 * Enter your name : Karan Kumar Nonia
 * Enter your coach : Second_AC
 * Enter your mobile number : 9304397220
 * Enter the basic amount of ticket : 1000
 * 
 * Ticket details :
 * Name: Karan Kumar Nonia
 * Coach: Second_AC
 * Mobile Number: 9304397220
 * Basic Amount: 1000
 * Total Amount: 1500
 */
