import java.util.*;
class validpalindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sh=sc.nextLine();
        char ch[]=sh.toLowerCase();
        sh = sh.replaceAll("[^\\d.]", "");
        for(int i=sh.length();i>sh.length();i--){
           System.out.print(sh);
        }
    }
}
