import java.util.Scanner;
public class CylinderArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        final double PI = 3.141592653589793;
        double surfaceArea = 2 * PI * radius * (radius + height);
        double volume = PI * radius * radius * height;
        System.out.println("Surface Area of the cylinder:"+ surfaceArea);
        System.out.println("Volume of the cylinder:" + volume);
    }
}


