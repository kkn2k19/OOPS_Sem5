// Write a program to accept one name as input and make its initials with the full title.

import java.util.Scanner;

public class A9NameInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String[] parts = sc.nextLine().split(" ");
        for (String part : parts) {
            System.out.print(part.charAt(0) + ".");
        }
        sc.close();
    }
}

// OUTPUT ---
// Enter full name: Karan Kumar Nonia
// K.K.N.