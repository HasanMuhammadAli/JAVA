package OOPConcepts;
class Customer{
    private String name;
    private String id;
    private int age;
    
    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
}
class EncapsulationMethods {
    public static void main(String[] args) {
        //For encapsulating the data class is used in OOP, to protect it.
        Customer c01 = new Customer();
        c01.setName("Ali");
        c01.setId("7042");
        c01.setAge(18);
        System.out.println(String.format("%s with id num: %s is %d years old.",c01.getName(),c01.getId(),c01.getAge()));
        //Below statement can't be executed as age is private member it can't be accessed directly we have to use class's method to access it.
        //Likewise for all private/protected instance variables and methods.
        //System.out.println(c01.age);
    }
}
