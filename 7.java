// 7. 

package chaptera_101_7;

public class ChapterA_101_7 {
    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();
        obj.add(20, 3);
        obj.sub(10,7);
        obj.multi(3, 4);
        obj.divi(15,3);
        obj.show();
    }
    
}

class Calculator2 {
    int addValue;
    int subValue;
    int mulValue;
    int diviValue;
    
    void add(int a, int b) {
        addValue = a+b;
    }
    void sub(int a, int b) {
        subValue = a-b ;
    }
    void multi(int a, int b) {
        mulValue = a*b;
    }
    void divi(int a, int b) {
        diviValue = a/b;
    }
    
    void show() {
        System.out.println("Addition = " + addValue);
        System.out.println("Subtraction = " + subValue);
        System.out.println("Multiplication = " + mulValue);
        System.out.println("Divison = " + diviValue);
    }
}
