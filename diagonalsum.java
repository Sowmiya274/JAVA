import java.util.*;

class main{  
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
	
	    int row = sc.nextInt();
		 int col = sc.nextInt();
		int[][] arr = new int[row][col];
 
    		System.out.println("Enter the elements of the matrix") ;
    		for(int i=0;i<row;i++)
    		{ 
	    		for(int j=0;j<col;j++)
	    		{ 
	        		arr[i][j] = sc.nextInt();
    			}
		}

    		for(int i=0;i<row;i++){ 
	    		for(int j=0;j<col;j++){ 
				if(i==j)
				{
					sum = sum + arr[i][j];
				}
    			}
		}
    	System.out.printf("SUM of the daigonal elements = "+sum);
 	}	
}


