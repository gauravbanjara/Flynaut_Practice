package Inheritance;
class Person{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Nameof the student is " + name + " and Age is " + age);
    }
}

class Student extends Person {
     String grade = "A";
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
//    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}


class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
//    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}


class Test{
    public static void main(String[] args) {
        Person person = new Person("Tony Stark", 40);
        Student student = new Student("Gaurav", 24,"A");
        Teacher teacher = new Teacher("Prasad", 26, "Java");

        person.displayDetails();
        student.displayDetails();
        teacher.displayDetails();
    }
}