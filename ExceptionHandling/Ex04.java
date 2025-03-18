package ExceptionHandling;
//Program that uses multiple catches
class Ex04 {
    public static void main(String[] args) {
        int n = args.length;
        int ans = -999;
        int arr [] = {1, 2, 3, 4, 5};
        try{
            ans = 420/n;
            System.out.println("arr[10] = " + arr[10]);        
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err);
        }catch(ArithmeticException err){
            System.out.println(err);
        }
        System.out.println("Answer = " + ans);
        System.out.println("Program terminated.");
    }
}
