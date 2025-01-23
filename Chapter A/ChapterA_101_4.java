// 4. Generate all the prime numbers from 1 to 100

// package chaptera_101_4;

public class ChapterA_101_4 {
    public static void main(String[] args) {
        PrimeNumbers obj = new PrimeNumbers();
        obj.setRange(1, 100);
        obj.printPrimeInRange();
    }
}

class PrimeNumbers {
    int start;
    int end;
    int num;

    void setRange(int a, int b) {
        start = a;
        end = b;
    }

    void checkPrime(int n) {
        int c = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0 && n != 1) {
            System.out.print(n + " ");
        }
    }

    void printPrimeInRange() {
        for (int i = start; i <= end; i++) {
            num = i;
            checkPrime(num);
        }
    }
}