package OOPConcepts;

class Animal{
    public void talk(){
        System.out.println("Animals can talk.");
    }
}

class Dog extends Animal{
    public void talk(){
        System.out.println("Dogs can talk.");
    }
}

class Overriding1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();//references Animal class
        Animal animal2 = new Dog();//references to Dog class
        Dog animal3 = new Dog();

        animal1.talk();
        animal2.talk();
        animal3.talk();
    }
}
