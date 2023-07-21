import java.util.*;
 class DisariumNumber
{
    public static void main(String[] args)
    {
         int d=0,sum = 0;
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
        while (num > 0)
        {
           
            num=num/10;
        }
     
        while (num > 0)
        {
             int r=num % 10;
            sum=sum + (int)Math.pow(r, d);
            num=num / 10;
             d++;
        }        
        if(num==sum)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }
        
    }
}