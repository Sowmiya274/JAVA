
import java.util.*;

class CoutSort {
public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		int value=obj.nextInt();
		int arr[]=new int[value];
			int max=0;
		int CountArray[];
	
		for(int i=0;i<arr.length;i++){
		    
		    arr[i]=obj.nextInt();
		}
			System.out.print("enter the original aray:");
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		   for(int ele:arr) {
			  
			   System.out.print(ele+" ");
		   }
		   System.out.println();
		   int CountArraySize;
		   CountArraySize=max+1;
		   CountArray = new int[CountArraySize];
		   for(int i=0;i<CountArraySize;i++)
		   {
			  CountArray[i]=0;
		   
		   }
		   //find the count of the every element
		   int n;
		   n=arr.length;
		   for (int i = 0; i < n; i++) // Store the count of each element  
		   {  
		     CountArray[arr[i]]++;  
		   }  
		   
		 
		   
		   for(int i = 1; i<=max; i++) 
		   {
			      CountArray[i] += CountArray[i-1]; 
		   }
		   int[] output = new int [n+1];  
	      
		   for (int i = n - 1; i >= 0; i--) 
	      {  
           output[CountArray[arr[i]] - 1] = arr[i];  
           CountArray[arr[i]]--;
           }
         for(int i = 0; i<n; i++)
         {  
         arr[i] = output[i];
         }
       for (int i = 0; i < n; i++) {
    	   
        System.out.print(arr[i] + " ");  
       }
}  
}