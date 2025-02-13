package String;

public class StringContains {
    public static void main(String[] args) {
        //contains method of String class
        //This function returns true/false according to the string passed in argument, it checks if that passed string is a part of original/main string

        String str = "Hello Guys!!";

        System.out.println("Do str contains 'Guys'? :"+str.contains("Guys"));//true

        // We can also pass another String object as a parameter.
        String str2 = "Hello";
        String str3 = "Bye";

        System.out.println("Do str contains str2?: "+str.contains(str2));//true

        System.out.println("Do str contains str3?: "+str.contains(str3));//false
    }
}
