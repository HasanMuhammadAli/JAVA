package String;
/*
 * String Methods:
 * 1.charAt()
 * 2.contains()
 * 3.format()
 * 4.length()
 * 5.split()
 */
class StringLength {
    public static void main(String[] args) {
        //Length method on String
        char chararray[] = {'W','e','l','c','o','m','e'};
        String str = new String(chararray);
        String str1 = "HELLO";
        System.out.println("Length of str: "+str.length());
        System.out.println("Length of str1: "+str1.length());
        System.out.println("Length of 'HI GUYS': "+"HI GUYS".length());
    }
}
