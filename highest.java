import java.util.*;
class highest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int y=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[n-1]>arr[n-2]){
                   y=arr[n-1]+arr[n-2];
                               System.out.print(y);
                               break;

            }
        }
    }
}
