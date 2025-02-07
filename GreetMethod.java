public class GreetMethod {
    public static void main(String []args){
        //Call to the Greet fn
        Greet("Ali");
        Greet("Stacy");
    }

    //Method that greets strangers
    public static void Greet(String name){
        System.out.println("Hello "+name);
    }
}
