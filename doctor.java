import java.util.*;
class doctor{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int add=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        if(arr[i]<=17){
            add+=200;
        }
        else if(arr[i]>=40){
            add+=300;
        }
        else if(arr[i]>17 && arr[i]<40){
            add+=400;
        }
     }
      System.out.print(add);
    }
       
    }