package Inheritance;
public class Fan extends Application{
    @Override
    void TurnOn() {
        System.out.println("Fan is on now");
    }
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.TurnOn();
        fan.TurnOff();
    }
}

