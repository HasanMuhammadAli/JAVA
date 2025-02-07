import java.util.Scanner;
public class AddMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        double num1 = scn.nextDouble();
        double num2 = scn.nextDouble();
        //Call to the Add fn
        double answer = Add(num1, num2);
        System.out.println("Answer = "+answer);
        scn.close();
    }
    //Method that does the addition of two numbers
    public static double Add(double num1, double num2){
        return num1+num2;
    }
}
