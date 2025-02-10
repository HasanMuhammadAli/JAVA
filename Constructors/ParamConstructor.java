package Constructors;
//In this example Rectangle is examined
public class ParamConstructor {
    int length, breadth;
    //below is parameterized constructor for [rectangle]
    ParamConstructor(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //get data fn
    void getData(){
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
    }
    public static void main(String[] args) {
        ParamConstructor obj1 = new ParamConstructor(10, 20);
        obj1.getData();
    }
}
