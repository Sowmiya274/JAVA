import java.util.*;
 class countchar{
         public static void main(String[] args){
          Scanner s = new Scanner(System.in);
	        String mystring=s.nextLine();
			char[] ch=mystring.toCharArray();
			int count=0;
			for(int i=0;i<mystring.length();i++){
				if(mystring.charAt(i)=='a'||mystring.charAt(i)=='i'||mystring.charAt(i)=='o'||mystring.charAt(i)=='e'||mystring.charAt(i)=='u')
			
				count++;
			}
			System.out.print(count);
		}
}

