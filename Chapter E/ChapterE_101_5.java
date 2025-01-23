// 5. Write a program to show Constructor Chaining in the same class. 

// package chaptere_101_5;

public class ChapterE_101_5 {
    public static void main(String[] args) {
        ConstructorChainingExample obj = new ConstructorChainingExample();
    }
}

class ConstructorChainingExample {
    int number;
    String text;

    ConstructorChainingExample() {
        this(42);
        System.out.println("Constructor 1: No parameters");
    }

    ConstructorChainingExample(int number) {
        this(number, "Default Text");
        System.out.println("Constructor 2: One parameter (int): " + this.number);
    }

    ConstructorChainingExample(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println("Constructor 3: Two parameters (int, String): " + this.number + ", " + this.text);
    }
}

/*
 * OUTPUT --
 * 
 * Constructor 3: Two parameters (int, String): 42, Default Text
 * Constructor 2: One parameter (int): 42
 * Constructor 1: No parameters
 */