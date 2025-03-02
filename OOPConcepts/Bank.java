package OOPConcepts;

/*
    Question: In a Banking System, there are two types of accounts: SavingsAccount and CurrentAccount. Both accounts have an interestRate() method, but with different interest rates.
*/
class BankAccount{
    void interestRate(){
        System.out.println("General Bank Interest Rate: 4%");
    }
}

class SavingsAccount extends BankAccount{
    void interestRate(){
        System.out.println("Saving Account Interset Rate: 6%");
    }
}

class CurrentAccount extends BankAccount{
    void interestRate(){
        System.out.println("Current Account Interest Rate: 3%");
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount account;

        account = new SavingsAccount();
        account.interestRate();// Output: Savings Account Interest Rate: 6%

        account = new CurrentAccount();
        account.interestRate();// Output: Current Account Interest Rate: 3%
    }
}
