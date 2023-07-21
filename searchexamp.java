import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int value = sc.nextInt();
        int s=0;
        int arr[]=new int[value];
        for(int i=0;i<value;i++){
           arr[i]=sc.nextInt();
        }
      int values = sc.nextInt();
          for(int i=0;i<value;i++){
              if(values==arr[i]){
                  s=1;
                  break;
              }
          }
          if(s == 1){
              System.out.print("success");
          }
          else
          {
              System.out.print("not success");
          }
    }
}