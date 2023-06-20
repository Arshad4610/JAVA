class staticdemo
{
static int a=3;
static int b;
static void meth(int x) 
{
System.out.println("x:"+x);
System.out.println("a:"+a);
System.out.println("b:"+b);
}
static
{
System.out.println("static block initialized");
b=a*4;
}
public static void main(String[] args)
{
staticdemo t=new staticdemo();
t.meth(7);
}
}
