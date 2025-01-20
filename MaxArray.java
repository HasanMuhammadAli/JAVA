import java.util.Scanner;

public class MaxArray {
    public static void main(String [] args){
        //Making object for Scanner class
        Scanner scn = new Scanner (System.in);
        int []arr = new int[5];
        int i;
        //Scanning the array elements
        System.out.println("Enter the array elements:");
        for(i=0;i<5;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        //Printing the array elements
        for(i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
