import java.util.*;
import java.util.Scanner; 
class main{
    public static void main(String[] args){
        char c;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter height of the pattern:");  
        n = sc.nextInt();
        c = sc.next().charAt(0);
        
 class main {  
      
    public static int absValue(int n) {  
        if(n < 0) {  
            return (-1 * n);  
        }else {  
            return n;  
        }  
    } 

        public static void drawPatternC(int h){  
            for(int i = 0; i < h; i++) {  
                System.out.printf("*");  
                for (int j = 0; j < (h - 1); j++) {  
                    if (i == 0 || i == h - 1) {  
                        System.out.printf("*");  
                    } else {  
                        continue;  
                    }  
                }  
                System.out.printf("\n");  
            }   
    }
}}}
