import java.util.*;
class countzero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        int countzero=0;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        for (int i=5;n/i>= 1; i *= 5)
        countzero+= n / i;
    System.out.print(countzero);
    }
}