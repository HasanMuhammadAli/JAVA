package String;

public class StringFormat {
    public static void main(String[] args) {
        String str = String.format("Hello %s\nI am %d years old. ", "Guys!!", 18);
        System.out.println(str);
        String myStr = "Hello %s! One kilobyte is %,d bytes.";
        String result = String.format(myStr, "World", 1024);
        System.out.println(result);
    }
}