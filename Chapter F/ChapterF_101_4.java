/*
4. Design a class Person with the following specification
- zero-argument constructor
- nationality()
- birthPlace()
The Employee class inherits from the Person with the following specification
- zero-argument constructor
- organisationName()
- workPlace()
The Manager class inherits from Employee with the following specification
- zero-argument constructor
- noOfSubordinates()
- managingPlace()
Create the necessary object to show the concept of multi-level inheritance. 
*/

class Person {
    Person() {
        System.out.println("Person class constructor called");
    }

    void nationality() {
        System.out.println("Nationality: Indian");
    }

    void birthPlace() {
        System.out.println("Birthplace: Dhanbad");
    }
}

class Employee extends Person {
    Employee() {
        System.out.println("Employee class constructor called");
    }

    void organisationName() {
        System.out.println("Organisation: SAKTI Pvt Ltd");
    }

    void workPlace() {
        System.out.println("Workplace: KOLKATA");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager class constructor called");
    }

    void noOfSubordinates() {
        System.out.println("Number of subordinates: 10");
    }

    void managingPlace() {
        System.out.println("Managing place: Durgapur Branch");
    }
}

public class ChapterF_101_4 {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.nationality();
        manager.birthPlace();
        manager.organisationName();
        manager.workPlace();
        manager.noOfSubordinates();
        manager.managingPlace();
    }
}

/*
 * OUTPUT ---
 * 
 * Person class constructor called
 * Employee class constructor called
 * Manager class constructor called
 * Nationality: Indian
 * Birthplace: Dhanbad
 * Organisation: SAKTI Pvt Ltd
 * Workplace: KOLKATA
 * Number of subordinates: 10
 * Managing place: Durgapur Branch
 */