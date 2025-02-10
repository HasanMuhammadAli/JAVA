package Constructors;
//In this example Rectangle is examined
public class NoArgConstructor {
    int length, breadth;
    NoArgConstructor(){
        //Whenever the object is created the below statement is executed.
        System.out.println("Object created for NoArgConstructor class.");
    }
    //set data fn
    void setData(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //get data fn
    void getData(){
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
    }
    public static void main(String[] args) {
        //object is created for NoArgConstructor class
        NoArgConstructor obj1 = new NoArgConstructor();
        obj1.setData(12, 10);
        obj1.getData();
    }
}
