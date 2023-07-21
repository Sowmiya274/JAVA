class quadri
{
    void declare()
    {
       System.out.println("***");
    }
    
}
class rectangle extends quadri
{
    void area1(int l,int b)
    {
        int a=l*b;
        System.out.println(a);
    }
}
class parallellogram extends quadri
{
    void area2(int l,int h)
    {
        int a=l*h;
        System.out.println(a);
    }
}
class trapezoid extends quadri
{
    void area3(int l,int b,int h)
    {
        int a=((l+b)*h)/2;
        System.out.println(a);
    }
}
class square extends quadri
{
    void area4(int l)
    {
        int a=l*l;
        System.out.println(a);
    }
}
class shapes 
{
    public static void main(String[] args) 
    {

        int l=8,b=7,h=6;
        rectangle r=new rectangle();
        System.out.print("area of rectangle:");
        r.area1(l,b);
        parallellogram p=new parallellogram();
        System.out.print("area of parallellogram:");
        p.area2(l,h);
        trapezoid t=new trapezoid();
        System.out.print("area of rectangle:");
        t.area3(l,b,h);
        square sq=new square();
        System.out.print("area of square:");
        sq.area4(l);
    }}