package chapterd_101_6;

public class ChapterD_101_6 {
    public static void main(String[] args) {
        Area obj = new Area();

        double parallelogramArea = obj.area(5, 7);
        System.out.println("Area of Parallelogram with base 5, height 7 : " + parallelogramArea);

        double rhombusArea = obj.area(7.3f, 3.7f);
        System.out.println("Area of Rhombus with diagonals as 7.3 and 3.7 : " + rhombusArea);

        double trapeziumArea = obj.area(4, 7, 9);
        System.out.println("Area of Trapezium with parallel sides as 4, 7 and perpendicular distance between them as 9 : " + trapeziumArea);
    }
}

class Area{
    double area(int base, int height){
        return base*height;
    }
    double area(float d1, float d2){
        return (1.0/2.0)*d1*d2;
    }
    double area(int a, int b, int h) {
        return ((1.0/2.0)*(a+b)*h);
    }
}

/*
OUTPUT -- 

Area of Parallelogram with base 5, height 7 : 35.0
Area of Rhombus with diagonals as 7.3 and 3.7 : 13.505000526905064
Area of Trapezium with parallel sides as 4, 7 and perpendicular distance between them as 9 : 49.5
*/
