// 6. Write the definition for a class called DOB that has integer primitive data members:
// day, month, year. The class has the following member functions:
// void setDOB(int, int, int) to set the Date of Birth
// void show () to display the Date of birth in DD/MM/YYYY format
// DOB findAge(DOB) has one parameter of type DOB. This method will find the age
// difference and will return DOB object. Print all DOB objects’ data. 

// package chapterc_101_6;

public class ChapterC_101_6 {
    public static void main(String[] args) {
        DOB dob1 = new DOB();
        dob1.setDOB(6, 9, 2004);
        DOB dob2 = new DOB();
        dob2.setDOB(5, 9, 2002);

        System.out.print("DOB1 : ");
        dob1.show();
        System.out.print("\nDOB2 : ");
        dob2.show();

        DOB ageDifference = dob1.findAge(dob2);
        System.out.print("\nAge Difference : ");
        ageDifference.show();
    }
}

class DOB {
    private int date, month, year;

    void setDOB(int d, int m, int y) {
        this.date = d;
        this.month = m;
        this.year = y;
    }

    void show() {
        System.out.println(date + "/" + month + "/" + year);
    }

    DOB findAge(DOB other) {
        int ageDate, ageMonth, ageYear;

        if (this.date < other.date) {
            this.date += 30;
            this.month -= 1;
        }
        ageDate = this.date - other.date;

        if (this.month < other.month) {
            this.month += 12;
            this.year -= 1;
        }
        ageMonth = this.month - other.month;

        ageYear = this.year - other.year;

        DOB ageDifference = new DOB();
        ageDifference.setDOB(ageDate, ageMonth, ageYear);
        return ageDifference;
    }
}

/*
 * OUTPUT --
 * 
 * DOB1 : 6/9/2004
 * 
 * DOB2 : 5/9/2002
 * 
 * Age Difference : 1/0/2
 */