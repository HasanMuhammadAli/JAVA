import java.util.Scanner;
public class BooleanMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scn.nextInt();
        System.out.println("Is number Even? "+ isEven(number));
        scn.close();
    }
    //Method that returns true if number is even or returns false
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
