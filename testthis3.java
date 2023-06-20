class A
{
A()
{
System.out.println("hello a");
}
A(int x)
{
this();
System.out.println(x);
}
}
class testthis3
{
public static void main(String[] args)
{
A t=new A(10);
}
}