import java.util.*;
class duck1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); 
        int count=0,n;
        while(a>0){
            int rem=a%10;
            if(rem==0)
           count++;
           else
            n=rem;
           a=a/10;
        }
        if(count>=0){
            System.out.print("duck number");
        }
        else
            System.out.println("not a duck number");
        
    
 }}