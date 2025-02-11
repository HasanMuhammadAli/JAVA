package Branching;

public class switchcase {
    public static void main(String[] args){
        String grade = "FF";
        switch(grade){
            case "AA":
                System.out.println("Great Student");
                break;
            case "AB":
                System.out.println("Great Student");
                break;
            case "BB": case "BC" :
                System.out.println("Average Student");
                break;
            case "CC": case "CD" : case "DD":
                System.out.println("Poor Student");
                break;
            default:
                System.out.println("Failed Student");
                
        }

    }
}
