import java.util.*;
class t20{
   public static int secondlargest(int arr[],int n){
    int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-2];
    }
    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(secondlargest(arr,4));
    }
}
