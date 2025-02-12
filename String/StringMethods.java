package String;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello guys!!";
        String str2 = "Welcome";
        String str3 = "";
        System.out.println("Length of str: "+str.length());//Find the length of String Object
        System.out.println("Substring :"+str.substring(1));//Returns String after 1st index
        System.out.println("Substring :"+str.substring(6, 12));
        System.out.println(str.contains("guys!!"));//Returns true if str contains "guys!!"
        System.out.println(str2.equals("welcome"));//Returns true if str2 equals "welcome" but don't ignore case 
        System.out.println(str2.equalsIgnoreCase("welcome"));//Returns true if str2 equals "welcome" but ignore case 
        System.out.println(str3.isEmpty());//Returns true if str3 is empty string
    }
}
