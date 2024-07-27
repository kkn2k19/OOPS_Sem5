// 2. Write a program to show the order of execution between local block(s), static
// block(s), instance block(s), and constructor(s). 

// package CODES.OOPS.Chapter C;

public class ChapterC_101_2 {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        ExecutionOrder obj = new ExecutionOrder();
        obj.demonstrateLocalBlock();
        System.out.println("Main method ends");
    }
}

class ExecutionOrder {
    static {
        System.out.println("1. Static block");
    }

    {
        System.out.println("2. Instance block");
    }

    ExecutionOrder() {
        System.out.println("3. Constructor");
    }

    void demonstrateLocalBlock() {
        {
            System.out.println("4. Local block inside method");
        }
    }
}

/*
 * OUTPUT--
 * 
 * Main method starts
 * 1. Static block
 * 2. Instance block
 * 3. Constructor
 * 4. Local block inside method
 * Main method ends
 */
