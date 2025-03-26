package ExceptionHandling;
import java.util.Scanner;
class NegNoException extends  Exception{
    String str;
    NegNoException (String str){
        this.str = str;
    }
    public String toString(){
        return "NegNoException: " + str;
    }
}
class Ex10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        int balance = scn.nextInt();
        scn.close();
        try{
            if(balance < 0){
                throw new NegNoException("Balance can't be negative.");
            }
            System.out.println("Entered num = " + balance);
        }catch(NegNoException err){
            System.out.println(err);
        }
        System.out.println("Program ends.");
        
    }
}