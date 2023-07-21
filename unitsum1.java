import java.util.*;
class sum1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++){
        sum=sum+arr[i];
        //System.out.print(sum/2);
       }
       //System.out.print(sum);
       int y=sum%10;
       int x=sum/10;
       System.out.print(x+y);
}
}