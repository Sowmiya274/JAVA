import java.util.*;
class zigzag{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //for(int i=0;i<a;i++)
        for(int i=1;i<a-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+1;
        }
        for(int i=0;i<a;i++){
        System.out.print(arr[i]+" ");
    }
}
}