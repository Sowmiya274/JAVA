import java.util.*;
class Main {
  public static void main(String[] args) {

    int a= 11;
    ss(a);
  }
  static void ss(int a)
  {
    String binary = Integer.toBinaryString(a);
    System.out.println(binary );
  }
}
//without using function


import java.util.*;
class main{
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //String b = Integer.toBinaryString(i);
        //System.out.print(b);
        int arr[]=new int[100];
        int i=0;
        while(n>0){
             arr[i++]=n%2;
          n=n/2;}
          for(int j=i-1;j>=0;j--)
            System.out.print(arr[j]);
        
    }
}

//count

import java.util.*;
class main{
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //String b = Integer.toBinaryString(i);
        //System.out.print(b);
        int arr[]=new int[100];
        int i=0;
        while(n>0){
             arr[i++]=n%2;
          n=n/2;}
          for(int j=i-1;j>=0;j--){
              System.out.println(arr[j]);
          }
          int count=0;
          int count0=0;
          
          for(int j=i-1;j>=0;j--){
              if(arr[j]==1){
                  count++;}
                  else{
                      count0++;
                      
                  }
          }
                  System.out.print("no of one's:"+count+"no of zero's:"+count0); 
    }
}
