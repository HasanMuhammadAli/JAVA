/* Dynamic Method Dispatch */
package OOPConcepts;
class A{
    void show(){
        System.out.println("From class A.");
    }
}
class B extends A{
    void show(){
        System.out.println("From class B.");
    }
}
class C extends A{
    void show(){
        System.out.println("From class C.");
    }
}
class DMD {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        A ref;
        ref = objA;
        ref.show();//A

        ref = objB;
        ref.show();//B

        ref = objC;
        ref.show();//C
    }
}
//In (DMD) Dynmaic Method Dispatch
/*  
    Key features:
            Method Overriding
            Superclass Reference, Subclass Object
            Runtime Decision
*/