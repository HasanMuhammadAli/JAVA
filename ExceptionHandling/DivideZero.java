package ExceptionHandling;

class DivideZero {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;

        //int ans = n / m;
        //System.out.println("Answer: " + ans);

        /*
           Below error occurs when we divide by zero.

         * Exception in thread "main" java.lang.ArithmeticException: / by zero
           at ExceptionHandling.DivideZero.main(DivideZero.java:8)
         */

         // Java program to demonstrates handling the exception using try-catch block

        try{
            // Code that may throw an exception
            int ans = n / m;   
            System.out.println("Answer: " + ans);
        }catch(ArithmeticException err){
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally{
            System.out.println("Program continues after handling the exception.");
        }
    }
}
