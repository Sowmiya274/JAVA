import java.util.*;
class tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int a[][]=new int[n+1][n+1];
       int count=1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            a[i][j]=sc.nextInt();
        }
       }
       int q=n*2+(n-2)*2;
        for(int i=2;i<n;i++){
            int max=5;
            for(int j=2;j<n;j++){
                 if(a[i][j]>=max)
                    count++;
            }
            
        }
        System.out.println(q+count+1);
    }
}