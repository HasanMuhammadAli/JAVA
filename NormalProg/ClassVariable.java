package NormalProg;
class StaticVarable{
    public static String name; //static variable name 
    public static String address; //static variable address
    
    //any static variable declared outside the method, constructor, or any block are known as class variable.

}


class ClassVariable {
    public static void main(String[] args) {
        StaticVarable.name="Stacy";
        StaticVarable.address="1212 California";
        System.out.println("Name: "+StaticVarable.name);
        System.out.println("Address: "+StaticVarable.address);
    }
}

