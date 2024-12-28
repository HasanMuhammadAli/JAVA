import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scn.nextInt();
        System.out.println("Number is : "+a);
        scn.close();
    }
    
}
