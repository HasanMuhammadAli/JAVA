class Calculator{
    int a = 5;
    static double add(double num1, double num2){
        return num1+num2;
    }
    static double subtract(double num1, double num2){
        return num1-num2;
    }
    //error: non-static variable a cannot be referenced from a static context
    // static void getA(){
    //     System.out.println("Local a = "+a);
    // }
}

class StaticMethod {
    public static void main(String[] args) {
        double sum = Calculator.add(5, 10);
        double difference = Calculator.subtract(10, 5);
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);

       // Calculator.getA();


        //below , that can be possible but it is suggested that static method should be called in a static way
        // Calculator c = new Calculator();
        // double ans=c.add(1,2);
        // System.out.println(ans);
    }
}
