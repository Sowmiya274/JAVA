import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        String s =Integer.toString(value);
        if(value>=100){
            System.out.print("good job");
        }
      else{
      System.out.print("wrong answer");}
    }
}