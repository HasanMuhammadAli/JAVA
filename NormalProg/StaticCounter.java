package NormalProg;
class StaticCounter{
    static int count = 0;
    StaticCounter(){
        count++;
        System.out.println("Object created. Count : "+count);
    }
    public static void main(String [] args){
        StaticCounter obj1 = new StaticCounter();
        StaticCounter obj2 = new StaticCounter();
        StaticCounter obj3 = new StaticCounter();
        System.out.println("Total objs: "+StaticCounter.count);
    }
}