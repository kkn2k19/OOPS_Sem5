// 6. Write the definition for a class called DOB that has integer primitive data members:
// day, month, year. The class has the following member functions:
// void setDOB(int, int, int) to set the Date of Birth
// void show () to display the Date of birth in DD/MM/YYYY format
// DOB findAge(DOB) has one parameter of type DOB. This method will find the age
// difference and will return DOB object. Print all DOB objects’ data. 

package chapterc_101_6;

public class ChapterC_101_6 {
    public static void main(String[] args) {
        DOB dob1 = new DOB();
        dob1.setDOB(06, 9,2004);
        DOB dob2 = new DOB();
        dob2.setDOB(30,07,2024);

        System.out.print("DOB1 : ");
        dob1.show();
        System.out.print("DOB2 : ");
        dob2.show();

        DOB ageDifference = dob1.findAge(dob2);
        System.out.print("Age Difference : ");
        ageDifference.show();
    }
}

class DOB {
    int date, month, year;

    void setDOB(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void show() {
        System.out.println(date + "/" + month + "/" + year);
    }

    DOB findAge(DOB obj) {
        DOB difference = new DOB();

        if (this.date < obj.date) {
            this.date += 30;
            this.month -= 1;
        }
        difference.date = this.date - obj.date;

        if (this.month < obj.month) {
            this.month += 12;
            this.year -= 1;
        }
        difference.month = this.month - obj.month;

        difference.year = this.year - obj.year;
        
        return difference;
    }
}

/*
OUTPUT --

DOB1 : 6/9/2004
DOB2 : 30/7/2024
Age Difference : 6/1/-20
*/
