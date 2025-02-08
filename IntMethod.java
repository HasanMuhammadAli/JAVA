import java.util.Scanner;
public class IntMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your birth year and the current year:");
        int birthyear = scn.nextInt();
        int currentyear = scn.nextInt();
        
        int age = findAge(birthyear, currentyear);
        System.out.println("Your age = "+age);
        scn.close();
    }
    //Method that finds the your age
    public static int findAge(int birthyear , int currentyear){
        return currentyear - birthyear;
    }
}
