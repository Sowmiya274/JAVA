import java.util.*;
 class sum{  
int a; 
  int b;
    void add(){ 
    int sum=a+b;
     System.out.print(sum);  
}
 }
 class main{ 
 public static void main(String args[]){
 sum sumname = new sum(); 
 int a,b;
 sumname.a=2;
 sumname.b=5;
 sumname.add();
    }
 }