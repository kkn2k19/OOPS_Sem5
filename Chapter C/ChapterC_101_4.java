// Write a program in JAVA to show that the object is passed by reference but
// primitive data types are passed by value. 

// package chapterc_101_4;

public class ChapterC_101_4 {
    public static void main(String[] args) {
        Example n1 = new Example();
        Example n2 = new Example();
        System.out.println("Before passing by value : " + n1.a);
        n1.call1(20);
        System.out.println("After passing by value : " + n1.a);
        System.out.println("Before passing by reference : " + n2.a);
        n2.call2(n2);
        System.out.println("After passing by reference : " + n2.a);
    }
}

class Example {
    int a = 10;

    void call1(int a) {
        a = a + 10;
    }

    void call2(Example ex) {
        ex.a = ex.a + 10;
    }
}

/*
 * OUTPUT --
 * 
 * Before passing by value : 10
 * After passing by value : 10
 * Before passing by reference : 10
 * After passing by reference : 20
 */