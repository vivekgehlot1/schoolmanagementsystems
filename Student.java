
package com.mycompany.schoolmanagementsystem;

public class Student extends schoolMember{
    private int grade=80;

    public Student(String name, String Id, int age ,int grade) {
        super(name, Id, age);
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void getRole() {
        System.out.println("  Student  ");
        System.out.println("grade :"+grade+"%");
        
    }
    
    
}