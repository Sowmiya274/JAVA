import java.util.*;
class abcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{10,20,30,40,10,50,10};
        int count=1;
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j<i;j--){
             if(arr[i]==arr[j]){
                count++;
             }
             for(int h=0;h<arr.length;h++){
                for(int g=arr.length-1;g<i;g--){
                    if(arr[h]!=arr[g]){
                             c++;
                    }
        }
    }
    }
}}}
