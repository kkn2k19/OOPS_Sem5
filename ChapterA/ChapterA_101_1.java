// 1. Write a program to check whether a number is ODD or EVEN.

package chaptera_101_1;
import java.util.Scanner;

public class ChapterA_101_1 {
    public static void main(String[] args) {
        Scanner gc = new Scanner(System.in);
        OddEven obj = new OddEven();
        System.out.println("Enter n : ");
        int num = gc.nextInt();
        obj.setN(num);
        obj.checkOddEven();
    }
}

class OddEven {
    int n;
    
    void setN(int k) {
        n = k;
    }
    
    void checkOddEven() {
        if (n%2==0) {
            System.out.println(n + " is an EVEN number");
        } else {
            System.out.println(n + " is an ODD number");
        }
    }
}
