import java.util.*;
class main 
{
public static void main(String[] args)
 {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    if(a%3==0)
       System.out.println("the number is divisible");
    else
       System.out.println("the number is not divisible by 3 and gives a remainde  " + (a%3));		
}
}