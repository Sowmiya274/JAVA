import java.util.Scanner;
import java.lang.Math;
class main
{
  public static void main(String ar[])
  {
   Scanner sc= new Scanner(System.in); 

   int num=sc.nextInt();
   int a[]=new int[num];
 
   for(int i=0;i<num;i++)
   {
     a[i]=sc.nextInt();
   }   
   int block=(int)(Math.sqrt(num));
   System.out.println("Enter the element to search:");
   int x=sc.nextInt();
   int i=0;
   int j=block;
   while(a[j]<x && j<num)
   {
    i=j;
    j=j+block; 
    if(j>num-1)
    {
     j=num-1;
    }
   
   }
   for(int k=i;k<=j;k++)
    {
      if(a[k]==x)
       {
        System.out.print(x + " is present in the list");
         return;
       }
    }
   System.out.print("Element doesn't exist");
   
  }
}