// 3. Design a class to overload a function volume () as follows:
// double volume(double r) — with radius (r) as an argument, returns the volume
// of the sphere using the formula:
// V = (4/3) * (22/7) * r * r * r
// double volume(double h, double r) — with height(h) and radius(r) as the
// arguments, returns the volume of a cylinder using the formula:
// V = (22/7) * r * r * h
// double volume(double 1, double b, double h) — with length(l), breadth(b), and
// height(h) as the arguments, returns the volume of a cuboid using the formula:
// V = l*b*h or (length * breadth * height) 

// package chapterd_101_3;

public class ChapterD_101_3 {
    public static void main(String[] args) {
        Volume obj = new Volume();

        double sphereVolume = obj.volume(5.0);
        System.out.println("Volume of sphere with radius 5.0: " + sphereVolume);

        double cylinderVolume = obj.volume(10.0, 5.0);
        System.out.println("Volume of cylinder with height 10.0 and radius 5.0: " + cylinderVolume);

        double cuboidVolume = obj.volume(4.0, 5.0, 6.0);
        System.out.println("Volume of cuboid with length 4.0, breadth 5.0, and height 6.0: " + cuboidVolume);
    }
}

class Volume {
    double volume(double r) {
        return ((4.0 / 3.0) * (22.0 / 7.0) * r * r * r);
    }

    double volume(double h, double r) {
        return ((22.0 / 7.0) * r * r * h);
    }

    double volume(double l, double b, double h) {
        return (l * b * h);
    }
}

/*
 * OUTPUT --
 * 
 * Volume of sphere with radius 5.0: 523.8095238095237
 * Volume of cylinder with height 10.0 and radius 5.0: 785.7142857142857
 * Volume of cuboid with length 4.0, breadth 5.0, and height 6.0: 120.0
 */