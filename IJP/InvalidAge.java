package IJP;

public class InvalidAge {
    public static void main(String[] args) {
        int age = 0;
        if (age > 18){
            System.out.println("Eligible for voting");
        }else {
            throw new IllegalAgeArgumentException("Age must be above 18 years");
        }
    }
}
