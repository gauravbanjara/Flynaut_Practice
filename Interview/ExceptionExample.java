package Interview;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throw new StudentNotFoundException("Student not found");
        }catch (StudentNotFoundException s){
            System.out.println(s.getMessage());
        }
    }
}