// 4. Implement a Student class with the following fields, constructors and methods:
// Fields:
// name;
// totalScore;
// numberOfQuizzes;
// Constructors:
// public Student(String name, double score)
// public Student(double score, String name)
// public Student(String name)
// Methods:
// public String getName()
// public double getAverage() //this should return zero if no quiz has been taken.
// public double getTotalScore()
// public void addQuiz(double score)
// public void printStudent() //this should print the student’s name and average score
// Write a java program that reads a student name and use the Student class to
// create a Student object. Then read the scores of the student in three quizzes and
// add each to the totalScore of the student using addQuiz() method and print the
// student object. 

// package chaptere_101_4;

public class ChapterE_101_4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the score for quiz " + i + ": ");
            double quizScore = scanner.nextDouble();
            student.addQuiz(quizScore);
        }

        student.printStudent();
        scanner.close();
    }
}

class Student {
    String name;
    double totalScore;
    int numberOfQuizzes;

    Student(String name, double score) {
        this.name = name;
        this.totalScore = score;
        this.numberOfQuizzes = 1;
    }

    Student(double score, String name) {
        this.name = name;
        this.totalScore = score;
        this.numberOfQuizzes = 1;
    }

    Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.numberOfQuizzes = 0;
    }

    String getName() {
        return this.name;
    }

    double getAverage() {
        if (this.numberOfQuizzes == 0) {
            return 0;
        }
        return this.totalScore / this.numberOfQuizzes;
    }

    double getTotalScore() {
        return this.totalScore;
    }

    void addQuiz(double score) {
        this.totalScore += score;
        this.numberOfQuizzes++;
    }

    void printStudent() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Average Score: " + getAverage());
    }
}

/*
 * OUTPUT --
 * 
 * Enter the student's name: Karan Kumar Nonia
 * Enter the score for quiz 1: 85
 * Enter the score for quiz 2: 90
 * Enter the score for quiz 3: 86
 * Student Name: Karan Kumar Nonia
 * Average Score: 87.0
 */
