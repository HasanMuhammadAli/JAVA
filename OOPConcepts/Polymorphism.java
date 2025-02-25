package OOPConcepts;

class Vehical{
    //Instance variable
    private String make;
    private String model;
    private int year;

    //Constructor
    public Vehical(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //setter methods
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    //getter methods
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    void start(){
        System.out.println("Engine starting.");
    }
    void stop(){
        System.out.println("Engine stopped.");
    }
}

class SUV extends Vehical{
    //Constructor
    public SUV(String make, String model, int year){
        super(make, model, year);
    }

    void start(){
        System.out.println("SUV started.");
    }
    void stop(){
        System.out.println("SUV stopped.");
    }
}

class MotorBike extends Vehical{
    //Constructor
    public MotorBike(String make, String model, int year){
        super(make, model, year);
    }
    void start(){
        System.out.println("Bike started.");
    }
    void stop(){
        System.out.println("Bike stopped.");
    }
}
class Polymorphism {
    public static void main(String[] args) {
        //Creating SUV class's object
        SUV toyota = new SUV("Toyota", "RAV4", 2015);
        toyota.start();
        toyota.stop();

        //Creating MotorBike class's object
        MotorBike harley = new MotorBike("Harley", "Samson", 2014);
        harley.start();
        harley.stop();
    }
}
