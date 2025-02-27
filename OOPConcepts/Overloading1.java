package OOPConcepts;

class Addition{
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2){
        return num1 + num2;
    }
}

class Overloading1 {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(12, 12));
        System.out.println(obj.add(12, 12, 12));
        System.out.println(obj.add(12.12, 12.12));
    }
}
