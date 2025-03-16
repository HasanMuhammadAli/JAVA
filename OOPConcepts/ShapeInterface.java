package OOPConcepts;

// Shape interface
interface Shape {
    // Abstract method (no implementation)
    double getArea();
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement getArea method
    @Override
    public double getArea() {
        return length * width;
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement getArea method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
class ShapeInterface {
    public static void main(String[] args) {
        // Create objects of Rectangle and Circle
        Shape rectangle = new Rectangle(5, 10); // Upcasting
        Shape circle = new Circle(7);          // Upcasting

        // Call getArea method
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
    }
}