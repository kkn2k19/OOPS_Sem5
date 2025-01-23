package CODES.OOPS.Chapter C;

public class ChapterC_101_4 {
    
}


public class PassByValueReferenceTest {
    public static void main(String[] args) {
        // Primitive data type example
        int num = 5;
        PrimitivePassExample ppe = new PrimitivePassExample();
        System.out.println("Before changeValue (primitive): " + num);
        ppe.changeValue(num);
        System.out.println("After changeValue (primitive): " + num);

        // Object reference example
        ObjectPassExample ope = new ObjectPassExample(5);
        System.out.println("Before changeValue (object): " + ope.value);
        ope.changeValue(ope);
        System.out.println("After changeValue (object): " + ope.value);
    }
}

class ObjectPassExample {
    int value;

    ObjectPassExample(int value) {
        this.value = value;
    }

    void changeValue(ObjectPassExample obj) {
        obj.value = obj.value + 10;
    }
}

class PrimitivePassExample {
    void changeValue(int value) {
        value = value + 10;
    }
}
