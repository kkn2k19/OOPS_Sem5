// 1. Write a program to show how ‘this’ keyword is used to differentiate between an
// instance variable and a local variable with the same name. 

// package chapterc_101_1;

public class ChapterC_101_1 {
    public static void main(String[] args) {
        Difference obj = new Difference();
        obj.set(101, "Karan");
        obj.display();
    }
}

class Difference {
    int roll = 100;
    String name = "Rahul";

    void set(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + roll);
    }
}

/*
 * OUTPUT--
 * 
 * Name : Karan
 * Roll No. : 101
 */
