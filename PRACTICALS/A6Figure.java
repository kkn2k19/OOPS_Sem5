// Define a class "FIGURE" and find out the area of cube, square and sphere using method overloading.

class Figure {
    double area(double side) {
        return side * side;
    }

    double area(double radius, float pi) {
        return (4 * pi * radius * radius);
    }
}

public class A6Figure {
    public static void main(String[] args) {
        Figure f = new Figure();
        System.out.println("Cube Area : " + 6 * f.area(2.2));
        System.out.println("Square Area: " + f.area(5));
        float pi = 3.14f;
        System.out.println("Sphere Area: " + f.area(3, pi));
    }
}

// OUTPUT ---
// Cube Area : 29.040000000000006
// Square Area: 25.0
// Sphere Area: 113.0400037765503