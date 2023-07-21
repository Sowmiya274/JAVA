import java.util.*;
class countvowels{
         public static void main(String[] args){
          Scanner s = new Scanner(System.in);
	        String mystring=s.nextLine();
            int count=0;
            for(int i=0;i<mystring.length();i++){
                char ch=mystring.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 count++;
            }
                   System.out.print(count);
       }
 }