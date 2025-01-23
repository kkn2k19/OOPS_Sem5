// 3. Create class MyNumber with only one private instance variable as a double
// type. Include the following methods (include respective constructors) isZero( ),
// isPositive(), isNegative( ), isOdd( ), isEven( ),isPrime(), isAmstrong() the above
// methods return boolean primitive type. getFactorial(), getSqrt(), getSqr(),
// sumDigits(), getReverse() the above methods return double primitive type. void
// listFactor(), void dispBinary() will show all the factors of the number and the binary
// equivalent of the number. 

// package chaptere_101_3;

public class ChapterE_101_3 {
    public static void main(String[] args) {
        MyNumber myNum = new MyNumber(153);

        System.out.println("Is Zero: " + myNum.isZero());
        System.out.println("Is Positive: " + myNum.isPositive());
        System.out.println("Is Negative: " + myNum.isNegative());
        System.out.println("Is Odd: " + myNum.isOdd());
        System.out.println("Is Even: " + myNum.isEven());
        System.out.println("Is Prime: " + myNum.isPrime());
        System.out.println("Is Armstrong: " + myNum.isArmstrong());
        System.out.println("Factorial: " + myNum.getFactorial());
        System.out.println("Square Root: " + myNum.getSqrt());
        System.out.println("Square: " + myNum.getSqr());
        System.out.println("Sum of Digits: " + myNum.sumDigits());
        System.out.println("Reverse: " + myNum.getReverse());

        myNum.listFactor();
        myNum.dispBinary();
    }
}

class MyNumber {
    double number;

    MyNumber(double number) {
        this.number = number;
    }

    boolean isZero() {
        return this.number == 0;
    }

    boolean isPositive() {
        return this.number > 0;
    }

    boolean isNegative() {
        return this.number < 0;
    }

    boolean isOdd() {
        return this.number % 2 != 0;
    }

    boolean isEven() {
        return this.number % 2 == 0;
    }

    boolean isPrime() {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    boolean isArmstrong() {
        int temp = (int) number;
        int sum = 0;
        int digits = String.valueOf(temp).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }

    double getFactorial() {
        if (number < 0)
            return -1;
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    double getSqrt() {
        return Math.sqrt(number);
    }

    double getSqr() {
        return number * number;
    }

    double sumDigits() {
        int temp = (int) number;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    double getReverse() {
        int temp = (int) number;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return reverse;
    }

    void listFactor() {
        System.out.print("Factors of " + (int) number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void dispBinary() {
        System.out.println("Binary equivalent of " + (int) number + " is: " + Integer.toBinaryString((int) number));
    }
}

/*
 * OUTPUT --
 * 
 * Is Zero: false
 * Is Positive: true
 * Is Negative: false
 * Is Odd: true
 * Is Even: false
 * Is Prime: false
 * Is Armstrong: true
 * Factorial: 2.006343905095681E269
 * Square Root: 12.36931687685298
 * Square: 23409.0
 * Sum of Digits: 9.0
 * Reverse: 351.0
 * Factors of 153 are: 1 3 9 17 51 153
 * Binary equivalent of 153 is: 10011001
 */
