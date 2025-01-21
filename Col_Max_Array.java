class Col_Max_Array{
	public static void main(String [] args){
		int arr[][]={
				{5, 100, 15},
				{20, 25, 30}
			};
		int temp_max;
		int max[] = new int [arr[0].length];
		int i,j;

		//calculating the max from each column
		for(j=0;j<arr[0].length;j++){
			temp_max= arr[0][j];
			for(i=0;i<arr.length;i++){
				if(temp_max < arr[i][j])
					temp_max = arr[i][j];
			}
			max[j] = temp_max;
		}
		
		//printing the max array
		for(j=0;j<max.length;j++)
			System.out.println("Max from col "+ j +" is "+max[j]);

		
	}
} 