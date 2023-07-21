import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int arr[][]=new int[value][value];
        for(int i=0;i<value;i++) {
			for(int j=0;j<value;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<value;i++) {
			for(int j=0;j<value;j++) {
      
			if(( (i==0)&&(j==2))||((i==2)&&(j==0)||(i==0)&&(j==0))||((i==2)&&(j==2)))
					
			{
				arr[i][j]=arr[i][j]+arr[1][1];
			
				System.out.print(arr[i][j]+" ");		
			}
			else if(arr[i][j]==arr[1][1])
			{
				arr[i][j]=arr[i][j];
				System.out.print(arr[i][j]+" ");	
			}
			else {
				
				System.out.print("*"+" ");
			}
			}
			System.out.println();
			}
		

    }
}
