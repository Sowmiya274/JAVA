import java.util.*;
class main{
    public static void main(String[] args){
    int a=123456;
       int sum=0;
       while(a>0)
    {
        int y=a%10;
        sum=sum+y;
        a=a/10;
    }
       int x=sum/10;
       int y=sum%10;
      
         System.out.println(x+y);
    }}