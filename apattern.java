import java.util.Scanner;   
 class main{
   
    public static void main(String[] args){
    public static int absValue(int n) {  
        if(n < 0) {  
            return (-1 * n);  
        }else {  
            return n;  
        }  
    }  
    // create drawPatternA() method to print the pattern of 'A'  
    public static void drawPatternA(int h, int w){  
        int n = w / 2;  
        for (int i = 0; i < h; i++) {  
            for (int j = 0; j <= w; j++) {  
                if (j == n || j == (w - n) || (i == h / 2 && j > n && j < (w - n))) {  
                    System.out.printf("*");  
                } else {  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
            n--;  
        }  
       }   } }