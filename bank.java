import java.util.*;
class bankA{
   void getbalance(int n){
    System.out.println(n);
   }
}
class bankB{
   void getbalance(int n1){
    System.out.println(n1);
   }
}
class bankC{
   void getbalance(int n2){
    System.out.println(n2);
   }
}
class bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int n1=sc.nextInt();
          int n2=sc.nextInt();
        bankC m=new bankC();
        m.getbalance(n2);
        bankB g=new bankB();
        m.getbalance(n1);
        bankA d=new bankA();
        m.getbalance(n);
    }
}
