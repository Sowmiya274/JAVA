import java.util.*;
class countword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=1;
        for(int i=1;i<str.length()-1;i++){
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            count++;
        }
        System.out.print(count);
    }
}