package ExceptionHandling;
//Program to demonstrate the use if throws keyword.
class Ex08 {
    static void myFunction() throws ArithmeticException{
        System.out.println("Inside myFunction().");
        throw new ArithmeticException();
    }
    public static void main(String[] args) {
        try {
            myFunction();
        } catch (ArithmeticException err) {
            System.out.println("Inside main function. Exception received: " + err);
        }
        System.out.println("Program terminated.");
    }
}
