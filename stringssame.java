import java.util.*;
class same{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sh=sc.next();
        String sh1=sc.next();
        int count=0;int y;
     for(int i=0;i<sh.length()-1;i++)
     {
        for(int j=0;j<sh1.length()-1;j++)
        {
        if(sh.charAt(i)==sh1.charAt(j))
        {
            System.out.print("0");
            break;
        }
        else if(sh.charAt(i)!=sh.charAt(j))
        {
            y=count++;
            System.out.print(y);
        }
    }
   }
   }
}
}
