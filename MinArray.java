import java.util.Scanner;
class MinArray{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		//declare and initialize array
		int [] arr = new int[3];
		int min,i;
		for(i = 0; i < arr.length;i++){
			arr[i] = scn.nextInt();
		}
		min = arr[0];
		for(i = 1; i < arr.length;i++){
			if(min > arr[i])
				min = arr[i];

		}
		System.out.println("Min = "+min);
 	}	
}