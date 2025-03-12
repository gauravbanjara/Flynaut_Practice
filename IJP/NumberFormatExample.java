package IJP;

public class NumberFormatExample {
    public static void main(String[] args) {
        String invalidNumber = "123ase"; // Invalid numeric string
        try {
            int number = Integer.parseInt(invalidNumber); // Will throw NumberFormatException
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}