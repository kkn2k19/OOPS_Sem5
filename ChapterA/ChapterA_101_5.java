// 5. 

package chaptera_101_5;

public class ChapterA_101_5 {
    public static void main(String[] args) {
        Operation obj = new Operation();
        obj.setValue(20, 0);
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.divison();
    }
}

class Operation {
    int a;
    int b;
    
    void setValue(int n1, int n2) {
        a = n1;
        b = n2;
    }
    
    void addition() {
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    void subtraction() {
        System.out.println(a + " - " + b + " = " + (a-b));
    }
    void multiplication() {
        System.out.println(a + " * " + b + " = " + (a*b));
    }
    void divison() {
        if (b == 0){
            System.out.println("UNDEFINED");
            return;
        }
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}
