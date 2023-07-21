import java.util.*;
class main 
{
public static void main(String[] args)
 {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    if(a%3==0)
       System.out.println("hiii");
    else if(a%5==0) 
       System.out.println("hello");	
    else if(a%3*5==0) 
         System.out.println("hiiihello");	
    else
        System.out.println("hiiihellohiii");
    
}
}