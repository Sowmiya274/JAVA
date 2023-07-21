import java.util.*;
class av{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count =0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
         for(int j=0;j<i;j++){
            if(arr[i]==arr[j])
            count++;
         }}
        System.out.print(n);
    }
}
