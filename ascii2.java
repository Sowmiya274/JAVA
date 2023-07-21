
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        char c=(char)s;
        System.out.println(c);
        if(s>=65 && s<=90 || s>=97 && s<=122)
        {
            System.out.println("ASCII VALUE");
        }
        else
        {
            System.out.println("NOT ASCII VALUE");
        }
    }
}