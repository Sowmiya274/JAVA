import java.util.*;
class ceasier
{
    public static void main(String[] args)
    {
        System.out.println(cipher("dqqd",23));  
       System.out.println(cipher("xqlyhuvlwb",23));
    }
  public static String cipher(String msg, int shift)
  {
            String s = "";
            int len = msg.length();
            for(int x = 0; x<len; x++)
            {
                char c = (char)(msg.charAt(x) + shift);
                if (c > 'z')
                    s += (char)(msg.charAt(x) - (26-shift));
                else
                    s += (char)(msg.charAt(x) + shift);
            }
            return s;
  }
 }

