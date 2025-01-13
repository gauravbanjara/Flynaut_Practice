package Exception;

public class Student {
    private String name;
    private int age;
    private String stdId;
    public Student(String name,String stdId) {
        this.name = name;
        this.stdId = stdId;
    }
    public void Display(){
        System.out.println("Student ID: " + stdId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Method to Set the age
    public void setAge(int age) throws IllegalArgumentException {
        if (age < 5 || age > 100) {
            throw new IllegalArgumentException("Invalid age. Age must be between 5 and 100.");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        Student std = new Student("Black Panther","MCU4859");
        Student std1 = new Student("Iron Man","MCU2589");
        try {
            // checking the age is valid or not
            std.setAge(25); // Black Panther
            std.Display();
            std1.setAge(2); // Tony Stark
            std1.Display();
        } catch (IllegalArgumentException e) {
            System.err.println("Exception : " + e.getMessage());
        }
    }
}


