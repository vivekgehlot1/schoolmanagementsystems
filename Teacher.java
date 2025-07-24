
package com.mycompany.schoolmanagementsystem;

public class Teacher  extends schoolMember{
    private String subject="maths";

    public Teacher(String name, String Id, int age,String Subject ) {
        super(name, Id, age);
        this.subject=Subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void getRole() {
        System.out.println("Teacher ");
        System.out.println(" Subject:"+subject);
    }
    
}
