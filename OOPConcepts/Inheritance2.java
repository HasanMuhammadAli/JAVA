package OOPConcepts;
//Base class
class Bicycle{
    public int gear;
    public int speed;

    //constructor
    Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    //Getter methods
    public int getGear(){
        return gear;
    }
    public int getSpeed(){
        return speed;
    }

    //Methods to modify speed
    public void applyBreak(int decrement){
        speed = Math.max(0, speed-decrement);//Prevent negative speed
    }
    public void speedUp(int increment){
        speed+=increment;
    }
    //Overriding toString() method
    @Override
    public String toString(){
        return "No. of gears: " + gear + "\nSpeed: " + speed ;
    }
}

class MountainBike extends Bicycle{
    private int seatHeight;

    //Constructor
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    //Setter
    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }

    //Getter
    public int getSeatHeight() {
        return seatHeight;
    }
    // Overriding toString() method
    @Override
    public String toString() {
        return super.toString() + "\nSeat height: " + seatHeight;
    }
}
class Inheritance2 {
    public static void main(String[] args) {
        Bicycle avon = new Bicycle(5, 20);
        System.out.println(avon);
        //when you print an object using System.out.println(object), Java automatically calls the toString() method of that object.
        MountainBike mb = new MountainBike(3, 30, 25);
        System.out.println(mb);
        //when you print an object using System.out.println(object), Java automatically calls the toString() method of that object.
    }
}
