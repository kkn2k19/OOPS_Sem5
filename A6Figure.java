// Define a class "FIGURE" and find out the area of cube, square and sphere using method overloading.

class Figure {
    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double radius, boolean isSphere) {
        return isSphere ? 4 * Math.PI * radius * radius : Math.PI * radius * radius;
    }
}

public class A6Figure {
    public static void main(String[] args) {
        Figure f = new Figure();
        System.out.println("Square Area: " + f.area(5));
        System.out.println("Rectangle Area: " + f.area(4, 6));
        System.out.println("Sphere Surface Area: " + f.area(3, true));
    }
}

// OUTPUT ---
// Square Area: 25.0
// Rectangle Area: 24.0
// Sphere Surface Area: 113.09733552923255