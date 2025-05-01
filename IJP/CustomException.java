package IJP;

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new CustomExceptionClass("Error occurred");
        } catch (CustomExceptionClass e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cleanup code");
        }
    }
}
