import java.util.*;
class same{
    public static void main(String[] args){
       
        int arr[]=new int[] {1, 2, 5, 4};
       int arr1[]=new int[]{1, 2, 5, 4, 0};
           //Arrays.equal( arr[i], arr[j]);
           if(Arrays.equals(arr,arr1)){
               System.out.print("YES");
           }
           else
           System.out.print("NO");
       }
    }
