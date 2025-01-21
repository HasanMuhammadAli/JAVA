class Col_Sum_Array{
	public static void main(String []args){
		int arr[][]= {
				{5,10,15},
				{15,20,30}
			};
		int sum[] = new int [arr[0].length];
		int i,j;
		
		
		//calculating the sum of column		
		for(j=0;j<arr[0].length;j++){
			for(i=0;i<arr.length;i++){
				sum[j] += arr[i][j];
			}
		}
		
		//print the sum array
		for(j=0;j<sum.length;j++)
			System.out.println("Sum of col "+ j + " is "+ sum[j]);
		
	}
}