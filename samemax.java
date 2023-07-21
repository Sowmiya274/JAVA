import java.util.*;
class samemax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        int count=0,max=0,pos=0;
        for(int i=0;i<a;i++)
            for(int j=0;j<b;j++)
                arr[i][j]=sc.nextInt();
            
         for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(arr[i][j]==1){
                    count++;
                }
                if(count>max){
                    max=count;
                    pos=i+1;
                }
            }
            //System.out.println(pos);
        }
        System.out.println(pos);
    }
 }
