// 1. Write a program to print the names of students by creating a Student class. If no
// name is passed while creating an object of the Student class, then the name
// should be "Unknown", otherwise the name should be equal to the String value
// passed while creating the object of the Student class. 

// package chaptere_101_1;

public class ChapterE_101_1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printName();

        Student student2 = new Student("Alice");
        student2.printName();
    }
}

class Student {
    String name;

    Student() {
        this.name = "Unknown";
    }

    Student(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Student's name: " + this.name);
    }
}

/*
 * OUTPUT --
 * 
 * Student's name: Unknown
 * Student's name: Alice
 */
