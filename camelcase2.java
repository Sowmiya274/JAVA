import java.util.*;
class camelcase2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sh=sc.nextLine();
        char arr[]=sh.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
            arr[i]=Character.toUpperCase(arr[i]);
            }
            if(arr[i]==' ')
            {
                arr[i+1]=Character.toUpperCase(arr[i+1]);
            }
        }
        System.out.println(arr);

    }
    
}