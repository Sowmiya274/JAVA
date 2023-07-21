 import java.util.*;
 class a{
     abstract void run(){
        //int a=1,b=1,c;
        //c=a+b;
        System.out.print("c");
    }
}
class b extends a{
    void rate(){
        System.out.print("good");
    }
}
class main{
    public static void main(String[] args){
       a obj=new b();
        obj.run();
        obj.rate();
    }
}
