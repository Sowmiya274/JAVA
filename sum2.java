import java.util.*;
class main{
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      int sum=0;
      int x=1;
          int row = sc.nextInt();
          int q=sc.nextInt();
       int arr[]= new int[row];
       if(q==1){
      for(int i=0;i<row;i++){
    
          arr[i]=sc.nextInt();
          sum=sum+arr[i];}
}
     System.out.print(sum);
     if(q==2){
        for(int j=0;j<row;j++){
            arr[j]=sc.nextInt();
            x=arr[1]*arr[2]*arr[3]*arr[4];
        }
        System.out.print(x);
     }
}}