

package com.mycompany.schoolmanagementsystem;

public class SchoolManagementSystem {

    public static void main(String[] args) {
        School ob =new School("vivek gehlot","D12",21,"Student");
        ob.getaddSchoolMember();
        ob.getdisplayAllMemberdetails();
        School ob1 =new School("Rohan das","A11",25,"Teacher");
        ob1.getaddSchoolMember();
        ob1.getdisplayAllMemberdetails();
    }
}
