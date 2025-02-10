package Constructors;
//In this example Rectangle is examined
public class CopyConstructor {
    int length, breadth;
    //Parameterized constructor
    CopyConstructor(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //copy constructor
    //A copy constructor takes object as a argument
    //A copy constructor is used to intialize an object from another object.
    CopyConstructor(CopyConstructor rect){
        this.length = rect.length;
        this.breadth = rect.breadth;
    }

    void display(){
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
    }
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(10,20);
        //object1 is passed as argument 
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj1.display();
        obj2.display();
    }
}
