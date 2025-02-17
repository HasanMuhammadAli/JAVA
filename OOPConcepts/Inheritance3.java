package OOPConcepts;
class Box{
    //instance variable
    private int length;
    private int width;

    //constructor
    public Box(int length, int width){
        this.length = length;
        this.width = width;
    }

    //Display box name
    public void displayBoxName(){
        System.out.println("I am parent Box.");
    }
}

class SmallBox extends Box{
    //instance variable 
    private int length;
    private int width;
    //constructor
    public SmallBox(int length, int width){
        super(length, width);
        this.length = length;
        this.width = width;
    }
    //Display Box name
    public void displayBoxName(){
        System.out.println("I am SmallBox.");
    }
    //Display area
    public void displayArea(){
        double area = length * width;
        System.out.println("Area = " + area);
    }
}

class BigBox extends Box{
    //instance variable 
    private int length;
    private int width; 
    private int height;

    //constructor
    public BigBox(int length, int width, int height){
        super(length, width);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //Display Box name
    public void displayBoxName(){
        System.out.println("I am BigBox.");
    }

    //Display area
    public void displayArea(){
        double area = length * width * height;
        System.out.println("Area = " + area);
    }
}
class Inheritance3 {
    public static void main(String[] args) {
        //Call Box
        Box box1 = new Box(12, 12);
        box1.displayBoxName();

        //Call SmallBox
        SmallBox box2 = new SmallBox(5, 3);
        box2.displayBoxName();
        box2.displayArea();

        //Call BigBox
        BigBox box3 = new BigBox(10, 10, 10);
        box3.displayBoxName();
        box3.displayArea();
    }
}
