package ExceptionHandling;
//Program to demonstrate the use of throw keyword.
class Ex06 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }catch(ArithmeticException err){
            System.out.println("Got error thrown by throw: " + err);
        }
    }
}
