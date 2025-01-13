package Inheritance;
public class Shapes {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    double calculateArea(double length, double width) {
        return length * width;
    }
}
    class Triangle extends Shapes {
        @Override
        double calculateArea(double base, double height) {
            return 0.5 * base * height;
        }
        public static void main(String[] args) {
        Shapes shapes = new Shapes();
        System.out.println(shapes.calculateArea(5));
        System.out.println(shapes.calculateArea(5,3));

        Triangle triangle = new Triangle();
        System.out.println(triangle.calculateArea(10,8));
    }
}

