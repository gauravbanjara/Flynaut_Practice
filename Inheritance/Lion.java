package Inheritance;

public class Lion extends Animals{
    @Override
    void sound() {
        System.out.println("Lion Roars");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        l.sound();
    }
}
