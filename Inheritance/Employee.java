package Inheritance;

public class Employee {
   public void Work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{
    @Override
   public void Work(){
        System.out.println("Manager is working");
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.Work();
        Manager manager = new Manager();
        manager.Work();
    }
}


