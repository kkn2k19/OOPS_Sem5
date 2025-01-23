// write a program that will accept the name of 10 students. Sort the name in ascending order and then print the entire students name in ascending order

import java.util.Arrays;
import java.util.Scanner;

public class A1SortName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[10];
        System.out.println("Enter 10 student names:");
        for (int i = 0; i < 10; i++) {
            students[i] = sc.nextLine();
        }
        Arrays.sort(students);
        System.out.println("Sorted student names:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}

// Enter 10 student names:
// John Alice
// Bob
// Zara
// Mike
// Charlie
// David Eve
// Nancy
// Oscar

// Sorted student names:
// Alice Bob
// Charlie
// David
// Eve
// John
// Mike
// Nancy
// Oscar
// Zara