package OOPConcepts;

class Animal{
    void sound(){
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows.");
    }
}

class DMD2 {
    public static void main(String[] args) {
         // Superclass reference, but subclass objects
         Animal myAnimal = new Animal(); // Animal object
         Animal myDog = new Dog();       // Dog object
         Animal myCat = new Cat();       // Cat object

         // Dynamic Method Dispatch in action
        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks
        myCat.sound();    // Output: Cat meows
    }
}
