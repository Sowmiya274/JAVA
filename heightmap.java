import java.util.*;
class heightmap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//row
        int b=sc.nextInt();//col
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
            int y=0;
            for(int k=0;k<a;k++){
                for(int j=0;j<b;j++){
                      if(arr[1][9]==1 && arr[2][9]==2 || arr[3][6]==6 && arr[4][7]==6){
                              y=arr[1][9]+ arr[2][9]+arr[3][6]+arr[4][7];
                      }
                      System.out.println(y);

                }}
        }
    }
}
