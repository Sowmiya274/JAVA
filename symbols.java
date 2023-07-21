import java.util.*;
class symbols{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] nuts=new char[n];
        char[] bolts=new char[n];
        for(int i=0;i<n;i++){
            nuts[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            bolts[i]=sc.next().charAt(0);
        }
        Arrays.sort(nuts);
        Arrays.sort(bolts);
        System.out.print(nuts+",");
        System.out.print(bolts+",");
    }
}