
package com.mycompany.schoolmanagementsystem;

abstract public class schoolMember {
    private String name;
    private String Id;
    private int age;

    public schoolMember(String name ,String Id,int age){
        this.name=name;
        this.Id=Id;
        this.age=age;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    abstract public void  getRole();
    public void getdisplaymemberdetails(){
        
        System.out.println("Member name is  :"+name);
        System.out.println("Member Id  is   :"+Id);
        System.out.println("Member Age is   :"+age);
    }
    
}
