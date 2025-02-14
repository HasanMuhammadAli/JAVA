package NormalProg;
class DatatypeTest {
    public static void main(String[] args){
        byte b = 5;
        System.out.println("Byte b = "+ b);
        short s = 50;
        System.out.println("Short s = "+s);
        int i = s;
        System.out.println("Int  i = "+i);
        long l = s;
        System.out.println("Long  l = "+l);
        float f = s;
        System.out.println("Float  f = "+f);
        double d = s;
        System.out.println("Double  d = "+d);

        //error for converting byte to char and byte to boolean

        //char ch = s;
        //System.out.println("Char  ch = "+ch);
        //boolean bool = s;
        //System.out.println("Boolean  bool = "+bool);
    }
}
