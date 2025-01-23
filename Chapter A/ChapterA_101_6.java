// 6. 

// package chaptera_101_6;

public class ChapterA_101_6 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.setValue(20, 3);
        obj.show();
    }
}

class Calculator {
    int a;
    int b;

    void setValue(int n1, int n2) {
        a = n1;
        b = n2;
    }

    void add() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    void sub() {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    void multi() {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    void divi() {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    void show() {
        add();
        sub();
        multi();
        divi();
    }
}