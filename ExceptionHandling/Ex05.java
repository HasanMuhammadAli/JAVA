package ExceptionHandling;
//Program to demonstrate nested try catch block
class Ex05 {
    public static void main(String[] args) {
        int n = args.length;
        int arr[] = {1, 2, 3, 4, 5};
        int ans = -999;
        try{
            ans = 420/n;
            System.out.println("Outer try: Ans: " + ans );
            try{
                ans = 420/(n-1);
                System.out.println("Inner try: Ans: " + ans);
                if (n==2) {
                    System.out.println(arr[10]);
                }
            }catch(ArrayIndexOutOfBoundsException err){
                System.out.println(err);
            }
        }catch(ArithmeticException err){
            System.out.println(err);
        }
        System.out.println("Ans: " + ans);
        System.out.println("Program terminated.");
    }
}
