package NormalProg;
class Labeled_Loop{
	public static void main(String []args){
		int i,j;
		//labeled loop
		outer:for(i=0;i<3;i++){
			inner:for(j=0;j<5;j++){
				if(j==3){
					//1.//break outer;//this statement will break the outer loop
					//2.//break inner;//this statement will break inner loop
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("End");
	}
}
/*
1.Op: 

0 1 2 
End


2.Op:

0 1 2
0 1 2
0 1 2 
End
*/