package classprogram;
/*
Create a Student class whose instance will represent name, roll number, email, mobile.
Implement 100% encapsulation.
 */
import java.util.Scanner;

public class Student {
    //Instance variable
    private String name;
    private int rollNo;
    private String email;
    private long mobileNo;

    //optional to use constructor
    public Student(String name, int rollNo, String email, long mobileNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
}
