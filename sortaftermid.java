import java.util.*;
class sortaftermid{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }  }
            for(int k=0;k<a;k++){
                System.out.print(arr[k]+" ");
            }  
            //System.out.print(arr[k]+" ");
    }
}
