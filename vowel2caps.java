import java.util.*;
class vowel2caps{
    static void convertvowel2caps(char[] str){
    int n=str.length;
    for(int i=1;i<n;i++){
        if(str[i] =='a' || str[i] =='e'||str[i] =='i'||str[i] =='o'||str[i] =='u')
        {
            char c=Character.toUpperCase(str[i]);
            str[i]=c;
        }}
        for(char c:str)
        System.out.print(c);
    }
          public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    convertvowel2caps(str.toCharArray());
    }         
}