package Inheritance;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Mammal extends Animal {
    private boolean hasFur;
    public Mammal(boolean fur) {
        hasFur = fur;
    }
    public boolean hasFur() {
        return hasFur;
    }
}
class Dog extends Mammal {
    private String breed;
    public Dog(boolean fur, String dogBreed) {
        super(fur);
        breed = dogBreed;
    }
    @Override
    public void sound() {
        System.out.println("Barks");
    }
    public String getBreed() {
        return breed;
    }
}
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(true, "BullDog");
        System.out.println("Dog's Breed: " + dog.getBreed());
        System.out.println("Has Fur: " + dog.hasFur());
        System.out.print("Sound: ");
        dog.sound();
    }
}

