package Inheritance;
public class Persons {
    private String name;
    private int age;
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Human{
    public static void main(String[] args) {
        Persons persons = new Persons();
        persons.setName("Gaurav Jadhav");
        persons.setAge(24);
        System.out.println("Name: " + persons.getName());
        System.out.println("Age: " + persons.getAge());
    }
}

