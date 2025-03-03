package Dependancy_Injection;

public class Student {
    private int rollno;
    private String name;
    private Address address;

    public Student(int rollno, String name, Address address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
