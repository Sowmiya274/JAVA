import java.util.*;
class duck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){
           if(arr[0]!=0 && arr[i+1]==0){
            //System.out.println("duck number");
            count++;
           }
           if(count==1){
           System.out.println("duck number"); 
        }
        else{
            System.out.println("not a duck number");
        }
    }
    }}