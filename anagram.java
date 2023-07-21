import java.util.*;
class abcd{
	public static void main(String[] args) {
		   String str1 = "cinema";
		   String str2 = "iceman";
		   str1 = str1.toLowerCase();
		   str2 = str2.toLowerCase();
		   if(str1.length() == str2.length()) {	
		   char[] a = str1.toCharArray();
		   char[] b = str2.toCharArray();
		   Arrays.sort(a);
		   Arrays.sort(b);
		   boolean result = Arrays.equals(a,b);
		   if(result) {
		      System.out.println(str1 + " and " + str2 + " are anagram.");
		   }
		    else {
		      System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }
		   }
		   
		   else {
		         System.out.println(str1 + " and " + str2 + " are not anagram.");
		       }

	}

}