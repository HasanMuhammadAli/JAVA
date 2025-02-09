package Constructors;

public class DefaultConstructor {
    //In this example Rectangle is discussed
    int length,breadth;
    void setData(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void getData(){
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
    }
    public static void main(String[] args) {
        DefaultConstructor obj1 = new DefaultConstructor();//this will invoke a default constructor as there is no explicit constructor defined
        obj1.setData(13, 12);
        obj1.getData();
    }
}
