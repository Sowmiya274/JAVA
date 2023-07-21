import java.util.*;
class strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();System.out.println();
        String b=sc.nextLine();
        int m=a.length();
        int n=b.length();
        System.out.println(m+n);
        if(a.compareTo(b)>0)
         System.out.println("Yes");
         else  System.out.println("No");
        System.out.print(a.substring(0,1).toUpperCase().concat(a.substring(1,m))+" "+b.substring(0,1).toUpperCase().concat(b.substring(1,n)));
    }
}
