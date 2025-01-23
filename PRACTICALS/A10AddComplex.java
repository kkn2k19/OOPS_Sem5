// Write a program to add two complex numbers (using object as passing parameter as well as returned element).

class Complex {
    int real, imaginary;

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class A10AddComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex result = c1.add(c2);
        result.display();
    }
}

// OUTPUT ---
// 6 + 8i