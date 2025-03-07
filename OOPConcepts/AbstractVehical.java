package OOPConcepts;

abstract class Vehicle {
    protected int wheels;
    protected int noOfPassengers;

    Vehicle(int wheels, int noOfPassengers) {
        this.wheels = wheels;
        this.noOfPassengers = noOfPassengers;
    }

    abstract void noiseGeneration();
    abstract void makeSound();

    public void displayInfo() {
        System.out.println("Wheels: " + wheels + ", Passengers: " + noOfPassengers);
    }
}

class Car extends Vehicle {
    private int horsePower;

    Car(int wheels, int noOfPassengers, int horsePower) {
        super(wheels, noOfPassengers);
        this.horsePower = horsePower;
    }

    @Override
    void noiseGeneration() {
        System.out.println("Car generates moderate noise.");
    }

    @Override
    void makeSound() {
        System.out.println("Car makes Beep Beep sound.");
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Horse Power: " + horsePower);
    }
}

class Truck extends Vehicle {
    private int horsePower;

    Truck(int wheels, int noOfPassengers, int horsePower) {
        super(wheels, noOfPassengers);
        this.horsePower = horsePower;
    }

    @Override
    void noiseGeneration() {
        System.out.println("Truck generates loud noise.");
    }

    @Override
    void makeSound() {
        System.out.println("Truck makes Poppop sound.");
    }

    public void displayTruckInfo() {
        displayInfo();
        System.out.println("Horse Power: " + horsePower);
    }
}

class Bicycle extends Vehicle {
    Bicycle(int wheels, int noOfPassengers) {
        super(wheels, noOfPassengers);
    }

    @Override
    void noiseGeneration() {
        System.out.println("Bicycle generates almost no noise.");
    }

    @Override
    void makeSound() {
        System.out.println("Bicycle makes Trin Trin sound.");
    }
}

class AbstractVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car(4, 5, 150);
        Vehicle truck = new Truck(6, 2, 300);
        Vehicle bicycle = new Bicycle(2, 1);

        System.out.println("Car Information:");
        car.displayInfo();
        car.noiseGeneration();
        car.makeSound();

        System.out.println("\nTruck Information:");
        truck.displayInfo();
        truck.noiseGeneration();
        truck.makeSound();

        System.out.println("\nBicycle Information:");
        bicycle.displayInfo();
        bicycle.noiseGeneration();
        bicycle.makeSound();
    }
}