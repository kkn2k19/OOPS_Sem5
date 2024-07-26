// 5.

package chapterc_101_5;

public class ChapterC_101_5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        rectangle1.length = 5f;
        rectangle1.width = 2.5f;
        rectangle2.length=5f;
        rectangle2.width=18.9f;
        rectangle1.show();
        System.out.println("Perimeter of Rectangle 1 : " + rectangle1.perimeter());
        System.out.println("Area of Rectangle 1 : "+rectangle1.area());
        rectangle2.show();
        System.out.println("Perimeter of Rectangle 2 : " + rectangle2.perimeter());
        System.out.println("Area of Rectangle 2 : "+rectangle2.area());
    }
}

class Rectangle {
    float length;
    float width;
    
    void setLength (float length){
        this.length = length;
    }
    
    void setWidth (float width){
        this.width = width;
    }
    
    float perimeter(){
        return 2*(length+width);
    }
    
    float area() {
        return length*width;
    }
    
    void show(){
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
    }
}
