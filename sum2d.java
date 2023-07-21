import java.util.*;
class main{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      int sum=0;
          int row = sc.nextInt();
          int col = sc.nextInt();
       int arr[][] = new Int[row][col];
      for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
          arr[i][j]=sc.nextInt();
  sum=sum+arr[i][j];
}}
System.out.print(sum);
}}
    

































public class SumofRowColumn    
{    
    public static void main(String[] args) {    
        int rows, cols, sumRow, sumCol;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        //Calculates sum of each row of given matrix    
        for(int i = 0; i < rows; i++){    
            sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    
            
        //Calculates sum of each column of given matrix    
        for(int i = 0; i < cols; i++){    
            sumCol = 0;    
            for(int j = 0; j < rows; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
}    

























import java.util.*;

class arr16
{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
	        int i,j,row,col,sum=0;
		System.out.println("Enter the number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the number of columns:");
		col = sc.nextInt();

		int[][] mat = new int[row][col];
 
    		System.out.println("Enter the elements of the matrix") ;
    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
	        		mat[i][j] = sc.nextInt();
    			}
		}
		
    		System.out.println("The elements of the matrix") ;
    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
	       	 		System.out.print(mat[i][j]+"\t");
    			}
      	 		System.out.println("");
		}

    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
				if(i==j)	//this condition checks for diagonal
				{
					sum = sum + mat[i][j];
				}
    			}
		}

    		System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
 	}	
}
































public class UpperTriangular    
{    
    public static void main(String[] args) {    
        int rows, cols;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 2, 3},    
                        {8, 6, 4},    
                        {4, 5, 6}    
                    };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
            //Performs required operation to convert given matrix into upper triangular matrix    
            System.out.println("Upper triangular matrix: ");    
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                  if(i > j)    
                    System.out.print("0 ");    
                  else    
                    System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}    