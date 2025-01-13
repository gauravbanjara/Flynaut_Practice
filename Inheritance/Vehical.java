package Inheritance;
public abstract class Vehical {
  public void FuelType(){}

}
class Bike extends Vehical{
    @Override
    public void FuelType() {
        System.out.println("Petrol");
    }
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.FuelType();
    }
}

