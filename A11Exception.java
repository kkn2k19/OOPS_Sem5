// Write a program to implement user defined exception which will throw your own exception when user provides invalid age.(Valid age range is 0 to 130). Your Exception class name will be MyException.

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class A11Exception {
    public static void main(String[] args) throws MyException {
        int age = 150;
        if (age < 0 || age > 130) {
            throw new MyException("Invalid age entered");
        }
    }
}

// OUTPUT ---
// Exception in thread "main" MyException: Invalid age entered
// at A11Exception.main(A11Exception.java:13)