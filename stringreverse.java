import java.util.*;
class stringreverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
       for(int i=0;i<input.length();i++){
            System.out.print(input.charAt(i));
        }
        char[] ch = input.toCharArray();
 
        for (int i =ch.length - 1; i >= 0; i--)
            System.out.print(ch[i]);
    }
}
