import java.util.*;
class IndividualCharacter {
    public static void main(String[] args) 
    {
     String str = "Technology";
    // Prints individual characters from given string.
       System.out.println("Individual characters from string: ");
    // Iterate through string and print individual characters.
       for(int i = 0; i < str.length(); i++)
       {
         System.out.print(str.charAt(i)+ " ");  
       }
     }
    }