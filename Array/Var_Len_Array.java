package Array;
class Var_Len_Array{
	public static void main(String [] args){
		int arr[][] = {
				{5 ,10},
				{15, 20, 25, 30},
				{35, 40, 45}
			};
		int i,j;
		//Printing variable length array
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
} 