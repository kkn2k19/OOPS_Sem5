/*
3. Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 – Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee'
and 'Manager' classes have data members 'specialization' and 'department'
respectively. Now, assign the name, age, phone number, address, and salary to an
employee and a manager by making an object of both of these classes and printing
the same. 
*/

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

class Manager extends Member {
    String department;

    void printManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}

public class ChapterF_101_3 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Karan";
        employee.age = 20;
        employee.phoneNumber = "9304397220";
        employee.address = "Barwadda";
        employee.salary = 99999;
        employee.specialization = "Software Development";

        Manager manager = new Manager();
        manager.name = "Chandan";
        manager.age = 22;
        manager.phoneNumber = "0227934039";
        manager.address = "Durgapur";
        manager.salary = 11111;
        manager.department = "Human Resources";

        employee.printEmployeeDetails();
        System.out.println();
        manager.printManagerDetails();
    }
}

/*
 * OUTPUT --
 * 
 * Employee Details:
 * Name: Karan
 * Age: 20
 * Phone Number: 9304397220
 * Address: Barwadda
 * Specialization: Software Development
 * Salary: 99999.0
 * 
 * Manager Details:
 * Name: Chandan
 * Age: 22
 * Phone Number: 0227934039
 * Address: Durgapur
 * Department: Human Resources
 * Salary: 11111.0
 */