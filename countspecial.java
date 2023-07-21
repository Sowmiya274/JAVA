import java.util.*;
class countspecial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sh=sc.next();
        int count=0;
        char[] ch=sh.toCharArray();
        for(int i=0;i<sh.length();i++){
            if(ch[i]=='!'||ch[i]=='@' ||ch[i]=='#'||ch[i]=='$'||ch[i]=='%'||ch[i]=='^'||ch[i]=='&'||ch[i]=='*'||ch[i]==')'||ch[i]=='-'||ch[i]=='(' )
                    count++;
        }
        System.out.print(count);
    }
}