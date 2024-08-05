#NOT COMPLETED YET !!!!!

// 5. Write a class with the name Perimeter using function overloading that computes
// the perimeter of a square, a rectangle, and a circle.
// The perimeter of a square = 4 * s
// The perimeter of a rectangle = 2 * (l + b)
// The perimeter of a circle = 2 * (22/7) * r

// package chapterd_101_5;

public class ChapterD_101_5 {
    public static void main(String[] args) {
        Perimeter obj = new Perimeter();

        double squarePerimeter = obj.perimeter(5.0);
        System.out.println("Perimeter of Square with side 5.0 : " + squarePerimeter);

        double rectanglePerimeter = obj.perimeter(10.0, 5.0);
        System.out.println("Perimeter of Rectangle with length 10.0 and breadth 5.0 : " + rectanglePerimeter);

        double circlePerimeter = obj.perimeter(4.0);
        System.out.println("Perimeter of Circle with radius 4.0 : " + circlePerimeter);
    }
}

class Perimeter {
    double perimeter(double s) {
        return (4 * s);
    }

    double perimeter(double l, double b) {
        return (2 * (l+b));
    }

    double perimeter(double r) {
        return (2 * (22.0/7.0) * r);
    }
}
