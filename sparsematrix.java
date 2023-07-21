 class SparseMatrix    
{    
    public static void main(String[] args) {    
        int rows, cols, size, count = 0;    
            
         
        int arr[][] = {       
                        {4, 0, 0},    
                        {0, 5, 0},    
                        {0, 0, 6}    
                    };    
              
          rows = arr.length;    
        cols = arr[0].length;    
            
        size = rows * cols;    
            
      
        for(int i = 0; i < rows; i++){    
            for(int j = 0; j < cols; j++){    
                if(arr[i][j] == 0)    
                    count++;    
                }    
            }    
                
        if(count > (size/2))    
            System.out.println("Given matrix is a sparse matrix");    
        else    
            System.out.println("Given matrix is not a sparse matrix");    
    }    
}     