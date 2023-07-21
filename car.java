import java.util.*;
class car{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int c1=sc.nextInt();
        int c2=sc.nextInt();
       int d1=sc.nextInt();
        int d2=sc.nextInt();
        int e1=sc.nextInt();
         int e2=sc.nextInt();
         int x=c1+(d1/a1)*60+60*e1;
          int y=c2+(d2/a2)*60+60*e2;
         System.out.print(x);
         System.out.print(y);
    }
}
