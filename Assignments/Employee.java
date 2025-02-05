public class Employee {
    private String name;
    private int age;
    private String phone;

    public void setEmployee(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployee("Panther", 35, "1234567890");
        System.out.println(e.toString());
    }
}
