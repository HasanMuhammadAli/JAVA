package Array;
import java.util.Scanner;
class Row_Sum_Array{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int [][]arr = new int [2][3];
		int sum[] = new int[arr.length];
		int i,j;
		
		//for reading an array
		System.out.print("Enter array elements:");
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				arr[i][j] = scn.nextInt();
			}
		}
		
		//adding the columns of a row and store them in sum array
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				sum[i]+=arr[i][j];
			}
		}
		
		//display sum array
		for(i=0;i<sum.length;i++)	
			System.out.println("Row "+i +" Sum " +sum[i] + " " );
		
	}
}