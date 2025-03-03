package OOPConcepts;
/*
 * In a payment system, there are two payment methods: CreditCard and UPI. 
 * How will you implement polymorphism to process both payments using a common method?
 */
class Payment{
    void pay(){
        System.out.println("Payment method seleted.");
    }
}

class CreditCard extends Payment{
    void pay(){
        System.out.println("Payment done using Credit Card.");
    }
}

class UPI extends Payment{
     void pay(){
        System.out.println("Payment done using UPI.");
     }
}

class PaymentSystem {
    public static void main(String[] args) {
        Payment payment;//Reference of parent class

        payment = new CreditCard();
        payment.pay();//Output: Payment done using Credit Card.

        payment = new UPI();
        payment.pay();//Output: Payment done using UPI.
    }
}
