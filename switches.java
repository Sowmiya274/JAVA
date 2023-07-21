import java.util.*;
class switches{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
            for(int j=1;j<a;j++){
                if (arr[j] == 1) {
                    arr[j] = 0;
                }
                else {
                    arr[j] = 1;
                }
            }
            count++;
            }
            System.out.print();
        }
}