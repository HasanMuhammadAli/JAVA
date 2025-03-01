package OOPConcepts;
class Vehical{
    String brand;
    int speed;

    Vehical(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo(){
        System.out.println("Brand: " + brand + " Speed: " + speed);
    }
}
class Car extends Vehical{
    int numberOfSeats;
    
    Car(String brand, int speed, int numberOfSeats){
        super(brand, speed);
        this.numberOfSeats = numberOfSeats;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of seats: " + numberOfSeats);
    }
}
class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 5);
        car.displayInfo();
    }
}