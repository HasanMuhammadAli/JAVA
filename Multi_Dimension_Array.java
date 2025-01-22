class Multi_Dimension_Array{
	public static void main(String [] args){
		int arr[][][]={
				{
					{1,2,3},
					{4,5,6}
				},
				{
					{7,8,9},
					{10,11,12}
				},
				{
					{7,8,9},
					{10,11,12}
				}
			};
		int k ,i,j;
		//System.out.println("2D"+arr.length);
		//System.out.println("2D"+arr[0].length);
		
		//for 3 total 2D array
		for(k=0;k<arr.length;k++){
			for(i=0;i<arr[k].length;i++){
				for(j=0;j<arr[k][i].length;j++){
					System.out.print(arr[k][i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}