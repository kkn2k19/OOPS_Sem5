// 2. Create a class named 'Rectangle' with two data members- length and breadth and
// a method to calculate the area which is 'length*breadth'. The class has three
// constructors which are:
// 1 - having no parameter - values of both length and breadth are assigned zero.
// 2 - having two numbers as parameters - the two numbers are assigned as length
// and breadth respectively.
// 3 - having one number as a parameter - both length and breadth are assigned
// that number.
// Now, create objects of the 'Rectangle' class having none, one, and two parameters
// and print their areas. 

// package chaptere_101_2;

public class ChapterE_101_2 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of Rectangle with no parameters: " + rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle(5, 10);
        System.out.println("Area of Rectangle with two parameters: " + rectangle2.calculateArea());

        Rectangle rectangle3 = new Rectangle(7);
        System.out.println("Area of Rectangle with one parameter: " + rectangle3.calculateArea());
    }
}

class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    }

    double calculateArea() {
        return this.length * this.breadth;
    }
}

/*
 * OUTPUT --
 * 
 * Area of Rectangle with no parameters: 0.0
 * Area of Rectangle with two parameters: 50.0
 * Area of Rectangle with one parameter: 49.0
 */