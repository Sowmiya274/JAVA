class main{
    public static void main(String[] args){
     String s=")()()()(";
     int count=0;
     for(int i=0;i<s.length();i++)
    {
       if(i!=' ')
       {
          count++;
        }
    }
   System.out.print("Total no of characters in string:" + count/2);

}}
