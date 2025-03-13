package ExceptionHandling;

public class Ex02 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //System.out.println(arr[10]);//error
        /*
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5 at ExceptionHandling.Ex02.main(Ex02.java:6)
         */

        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Accessing array element out of bound.");
        }finally{
            System.out.println("The 'try catch' is finished.");
        }
    }
}
