// 5. Write the definition for a class called Rectangle that has floating point data
// members: length and width. The class has the following member functions:
// void setlength(float) to set the length of data member
// void setwidth(float) to set the width data member
// float perimeter() to calculate and return the perimeter of the rectangle
// float area() to calculate and return the area of the rectangle
// void show() to display the length and width of the rectangle
// boolean isSameArea(Rectangle) that has one parameter of type Rectangle. This
// method returns True if the two Rectangles have the same area, and returns False
// if they don't.
// a. Write the definitions for each of the above member functions.
// b. Write the main method to create two rectangle objects. Set the length and
// width of the first rectangle to 5 and 2.5. Set the length and width of the second
// rectangle to 5 and 18.9. Display each rectangle and its area and perimeter.
// c. Check whether the two Rectangles have the same area and print a message
// indicating the result. Set the length and width of the first rectangle to 15 and 6.3.
// Display each Rectangle and its area and perimeter again. Again, check whether the
// two Rectangles have the same area and print a message indicating the result. 

// package chapterc_101_5;

public class ChapterC_101_5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        rectangle1.length = 5f;
        rectangle1.width = 2.5f;
        rectangle2.length = 5f;
        rectangle2.width = 18.9f;

        System.out.println("Rectangle 1:");
        rectangle1.show();
        System.out.println("Perimeter of Rectangle 1 : " + rectangle1.perimeter());
        System.out.println("Area of Rectangle 1 : " + rectangle1.area());

        System.out.println("\nRectangle 2:");
        rectangle2.show();
        System.out.println("Perimeter of Rectangle 2 : " + rectangle2.perimeter());
        System.out.println("Area of Rectangle 2 : " + rectangle2.area());

        // Check whether the two Rectangles have the same area
        if (rectangle1.isSameArea(rectangle2)) {
            System.out.println("\nRectangle 1 and Rectangle 2 have the same area.");
        } else {
            System.out.println("\nRectangle 1 and Rectangle 2 do not have the same area.");
        }

        rectangle1.setLength(15f);
        rectangle1.setWidth(6.3f);

        System.out.println("\nAfter setting new dimensions for Rectangle 1:");
        System.out.println("Rectangle 1:");
        rectangle1.show();
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.perimeter());
        System.out.println("Area of Rectangle 1: " + rectangle1.area());

        System.out.println("\nRectangle 2:");
        rectangle2.show();
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.perimeter());
        System.out.println("Area of Rectangle 2: " + rectangle2.area());

        // Check whether the two Rectangles have the same area again
        if (rectangle1.isSameArea(rectangle2)) {
            System.out.println("\nRectangle 1 and Rectangle 2 have the same area.");
        } else {
            System.out.println("\nRectangle 1 and Rectangle 2 do not have the same area.");
        }
    }
}

class Rectangle {
    float length;
    float width;

    void setLength(float length) {
        this.length = length;
    }

    void setWidth(float width) {
        this.width = width;
    }

    float perimeter() {
        return 2 * (length + width);
    }

    float area() {
        return length * width;
    }

    void show() {
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
    }

    boolean isSameArea(Rectangle other) {
        return this.area() == other.area();
    }
}

/*
 * OUTPUT --
 * 
 * Rectangle 1:
 * Length : 5.0
 * Width : 2.5
 * Perimeter of Rectangle 1 : 15.0
 * Area of Rectangle 1 : 12.5
 * 
 * Rectangle 2:
 * Length : 5.0
 * Width : 18.9
 * Perimeter of Rectangle 2 : 47.8
 * Area of Rectangle 2 : 94.5
 * 
 * Rectangle 1 and Rectangle 2 do not have the same area.
 * 
 * After setting new dimensions for Rectangle 1:
 * Rectangle 1:
 * Length : 15.0
 * Width : 6.3
 * Perimeter of Rectangle 1: 42.6
 * Area of Rectangle 1: 94.5
 * 
 * Rectangle 2:
 * Length : 5.0
 * Width : 18.9
 * Perimeter of Rectangle 2: 47.8
 * Area of Rectangle 2: 94.5
 * 
 * Rectangle 1 and Rectangle 2 have the same area.
 */
