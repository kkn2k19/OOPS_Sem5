// Write a program to accept one name as input and make its initials with the full title.

import java.util.Scanner;

public class A9NameInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String[] parts = sc.nextLine().split(" ");
        
        for (int i = 0; i < parts.length - 1; i++) {
            System.out.print(parts[i].charAt(0) + ".");
        }
        
        // Print the last part (full last name without an extra dot)
        System.out.print(parts[parts.length - 1]);
    }
}

// OUTPUT ---
// Enter full name: Karan Kumar Nonia
// K.K.Nonia