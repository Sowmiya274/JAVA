import java.util.*;
class IdentityMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int Flag = 1;
	int a=sc.nextInt();
	int arr[][]=new int[a][a];
	for(int i=0;i<a;i++){
	    for(int j=0;j<a;j++){
	        arr[i][j]=sc.nextInt();
	    }
	}
		for(int i = 0; i < 3 ; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(arr[i][j] != 1 && arr[i][j] != 0) {
					Flag = 0;
					break;
				}
			}
		}
		if(Flag == 1) {
			System.out.println("\nMatrix is an Identity Matrix");
		}
		else {
			System.out.println("\nMatrix is Not an Identity Matrix");
		}
	}
}