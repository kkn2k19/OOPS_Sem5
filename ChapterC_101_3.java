// 3. Write the definition for a class called Complex that has floating point data
// members for storing real and imaginary parts. The class has the following member
// functions:
//  void set(float, float) to set the specified value in the object
//  void disp() to display complex number object
//  complex sum(complex) to sum two complex numbers & return complex number
//  a. Write the definitions for each of the above member functions.
//  b. Write the main function to create three complex number objects. Set the value
// in two objects and call sum() to calculate the sum and assign it to the third object.
// Display all complex numbers.

package chapterc_101_3;

public class ChapterC_101_3 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3;

        c1.set(1.2f, -3.4f);
        c2.set(-5.6f, 7.8f);

        System.out.println("Complex number 1: ");
        c1.disp();

        System.out.println("Complex number 2: ");
        c2.disp();

        c3 = c1.sum(c2);
        System.out.println("Sum of complex numbers: ");
        c3.disp();
    }
}

class Complex {
    float real, imaginary;

    void set(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void disp() {
        if (real < 0 && imaginary < 0) {
            System.out.println(real + " " + imaginary + "i");
        } else if (real < 0){
            System.out.println(real + " + " + imaginary + "i");
        } else if (imaginary < 0){
            System.out.println(real + " " + imaginary + "i");
        } else {
        System.out.println(real + " + " + imaginary + "i");
        }
    }

    Complex sum(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;
        return result;
    }
}

/*
 * OUTPUT --
 * 
 * Complex number 1:
 * 1.2 + 3.4i
 * Complex number 2:
 * 5.6 + 7.8i
 * Sum of complex numbers:
 * 6.8 + 11.200001i
 */
