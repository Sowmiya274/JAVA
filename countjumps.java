import java.util.*;
class countjump{
 public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            int m=n/2;
             System.out.print(m);
        }
        else{
            int m=n/2+1;
             System.out.print(m);
        }
       
    }
}