import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        int arr[]=new int[value];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int rotate=sc.nextInt();
        for(int j=0;j<rotate;j++){
            int temp=arr[6];
            arr[6]=arr[5];
            arr[5]=arr[4];
            arr[4]=arr[3];
            arr[3]=arr[2];
            arr[2]=arr[1];
            arr[1]=arr[0];
            arr[0]=temp;
        }
        for(int i=0;i<value;i++){
            System.out.print(arr[i]);
        }
        int target=sc.nextInt();
       for(int i=0;i<rotate;i++){
        if(target==arr[i])
        {
            System.out.print(arr[i]);
        } 
        
    }
}}
