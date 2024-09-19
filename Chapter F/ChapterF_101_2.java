/*
2. In the above example, declare the method of the Parent class as private and then repeat the first two operations (You will get an error in the third). It shows that the private member is only accessed within the same class and the private member is not inherited. 
*/

class Parent {
    private void displayParent() {
        System.out.println("This is parent class");
    }

    public void callParentMethod() {
        displayParent();
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is child class");
    }
}

public class ChapterF_101_2 {
    public static void main(String[] args) {
        Parent parentObject = new Parent();
        parentObject.callParentMethod();

        Child childObject = new Child();
        childObject.displayChild();

        // 3. Calling the method of Parent class by the object of Child class
        // This will cause a compilation error because the method is private and not
        // inherited
        // childObject.displayParent(); // Error: displayParent() has private access in
        // Parent
    }
}

/*
 * OUTPUT ---
 * 
 * This is parent class
 * This is child class
 */
