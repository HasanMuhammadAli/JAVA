package OOPConcepts;

class Person{
    //characteristics of Person class
    private String name;
    private int age;

    //setter function
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    //getter function
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Employee extends Person{
    private String SSN;

    public String getSSN(){
        return SSN;
    }
    public void setSSN(String SSN){
        this.SSN = SSN;
    }
}
class Inheritance {
    public static void main(String[] args) {
        //Create Person class object
        Person person1 = new Person();
        person1.setName("Ali");
        person1.setAge(18);
        System.out.println(String.format("%s's age is: %d",person1.getName(),person1.getAge()));

        //Create Employee class object
        Employee emp1 = new Employee();
        emp1.setName("Stacy");
        emp1.setAge(14);
        emp1.setSSN("341-234-2134");
        System.out.println(String.format("%s's with ssn: %s, age is: %d",emp1.getName(), emp1.getSSN(), emp1.getAge()));
    }
}
