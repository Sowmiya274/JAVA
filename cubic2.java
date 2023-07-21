class Cubic {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number:");
      
        int a=sc.nextInt();
        int b=1;
        for(int i=0;i<a;i++)
        {   
            System.out.println("Cubic:"+(b*b*b));
            b++;
        }
    }
}