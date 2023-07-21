import java.util.*;
class happyornot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        int sum=0;
       while(n!=0){
        rem=n%10;
       sum=sum+(rem*rem);
       n=n/10;
       }
    }
}