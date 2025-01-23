/*
3. Follow the following code and write a program to show that ‘super’ keyword is used to access the super class method member (message()).
    // Base class Person 
        class Person
        {
            void message()
            {
                System.out.println("This is person class");
            }
        }
    // Subclass Student
        class Student extends Person
        {
            void message()
            {
                System.out.println("This is student class");
            }
            // Note that display() is only in Student class
            void display()
            {
                …………
            }
        }
    // Expected Output:
    // My parent’s Message was : This is person class
    // My Message Is : This is student class
*/

class Person {
    void message() {
        System.out.println("This is person class");
    }
}

class Student extends Person {
    @Override
    void message() {
        System.out.println("This is student class");
    }

    void display() {
        super.message();
        this.message();
    }
}

public class ChapterG_101_3 {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.display();
    }
}

/*
 * OUTPUT ---
 * 
 * This is person class
 * This is student class
 */
