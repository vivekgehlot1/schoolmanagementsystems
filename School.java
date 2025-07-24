
package com.mycompany.schoolmanagementsystem;

public class School {
    private schoolMember schoolmember;
    private Student student;
    private Teacher teacher;
   
    public School (String name ,String id,int age,String rol){
        schoolmember=new schoolMember(name,id,age) {
            @Override
            public void getRole() {
                System.out.println(rol);
                System.out.println("grade 80%");
            }
        };
    }
    public void getaddSchoolMember(){
        System.out.println("add school member");
    }
    public void getdisplayAllMemberdetails(){
        schoolmember.getRole();
        schoolmember.getdisplaymemberdetails();
         
    } 
}
