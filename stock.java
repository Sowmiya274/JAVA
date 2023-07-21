import java.util.*;
class stock{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //int sum=0;int sum1=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /*for(int i=0;i<n;i++){
            if(arr[i]==100){
                System.out.print("1");
            }
            else if(arr[i]<arr[i+1]){
                //sum++;
                System.out.print("1");
            }
            else if(arr[i]>arr[i+1]){
                sum1=sum1+2;
                System.out.print(sum1);
            }}
        }*/
        System.out.print("1"+" ");
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                System.out.print("1"+" ");
            }
            else 
            {
                for(int j=i;j>=0;j--)
                {
                    if(arr[j]>arr[i])
                    {
                        System.out.print(i-j +" ");
                        break;
                    }
                }
            }
        }
    }
}