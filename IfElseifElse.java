import java.util.Scanner;
public class IfElseifElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scn.nextInt();
        System.out.println("Number is : "+a);
        scn.close();
        if(a < 0){
            System.out.println(a+" is less than 0.");
        }
        else if(a > 0){
            System.out.println(a+" is greater than 0.");
        }
        else{
            System.out.println(a+" is equals than 0.");
        }
    }
}



    
    

