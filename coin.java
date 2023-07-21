import java.util.*;
class coin{ 

    static int Ways(int[] coins, int sum) {
    	int size = coins.length;
    	int[][] arr = new int[size + 1][sum + 1];
    	for(int i = 0; i < size + 1; i++)
    		arr[i][0] = 1;
    	for(int i = 1; i < size + 1; i++)
    		for(int j = 0; j < sum + 1; j++)
    			if(coins[i - 1] > j)  
    				arr[i][j] = arr[i - 1][j];
    			else
    				arr[i][j] = arr[i][j - coins[i - 1]] + arr[i - 1][j];
    	
    	return arr[size][sum];
    }
  
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[] =new int[n];
        int sum=sc.nextInt();
         for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
         }
        System.out.println(Ways(coins, sum));
    } 
}
