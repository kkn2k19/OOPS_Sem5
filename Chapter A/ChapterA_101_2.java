// 2. Generate all the ODD numbers from 1 to 100.

// package chaptera_101_2;

public class ChapterA_101_2 {
    public static void main(String[] args) {
        OddNumbers obj = new OddNumbers();
        obj.setRange(1, 100);
        obj.printOddInRange();
    } 
}

class OddNumbers {
    int start;
    int end;
    
    void setRange(int a, int b) {
        start = a;
        end = b;
    }
    
    void printOddInRange() {
        for (int i = start; i <= end; i++){
            if (i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}