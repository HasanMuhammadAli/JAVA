package NormalProg;
public class Or {
    public static void main(String[] args) {
        int age = 56;
        double account_balance = 1050600.84;
        if (account_balance >= 1000000 || age >= 65){
            System.out.println("You can retire now, Good luck.");
        }
        else{
            System.out.println("You still need to save moneey for retirement.");
        }
    }
}
