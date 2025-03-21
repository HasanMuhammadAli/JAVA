package ExceptionHandling;
//Program to demonstrate the concept rethrow
class Ex07 {
    public static void main(String[] args) {
        try{
            try {
                throw new ArithmeticException();
            } catch(ArithmeticException err) {
                System.out.println("Manually thrown: " + err);
                throw err;
            }
        }catch(ArithmeticException err){
            System.out.println("Rethrown Exception: " + err);
        }
        System.out.println("Program terminated.");
    }
}
