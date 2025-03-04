package OOPConcepts;

class Shape {
    double length, width;
    Shape(){
        length = width = 1;
    }
    Shape(double length, double width){
        this.length = length;
        this.width = width;
    }
    double getArea(){
        return -1;
    }
}

class Rectangle extends Shape{
    Rectangle(double length, double width){
        super(length, width);
    }
    double getArea(){
        return length * width;
    }
}

class Triangle extends Shape{
    Triangle(double length, double width){
        super(length, width);
    }
    double getArea(){
        return length * width * 0.5;
    }
}

class DMDShape{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(1, 2);

        Shape ref;//Reference of parent class
        ref = r;//object of child class
        System.out.println("Area of rectngle: "+ ref.getArea());

        ref = t;//object of child class
        System.out.println("Area of Triangle: "+ ref.getArea());
    }
}