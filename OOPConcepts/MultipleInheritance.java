package OOPConcepts;
/*
Java directly don't support multiple inheritance, it support multiple inheritace using interface.
*/
interface Walkable{
    void walk();
}
interface Swimmable{
    void swim();
}
interface Flyable{
    void fly();
}

class Duck implements Walkable, Swimmable, Flyable{
    @Override
    public void walk(){
        System.out.println("Duck is walking.");
    }

    @Override
    public void swim(){
        System.out.println("Duck is swimmming.");
    }

    @Override
    public void fly(){
        System.out.println("Duck is flying.");
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.walk();
        duck.swim();
        duck.fly();
    }
}
