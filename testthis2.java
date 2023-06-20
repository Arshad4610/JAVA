class A
{
void m()
{
System.out.println("hello m");
this.n();
}
void n()
{
System.out.println("hello n");

}
}
class testthis2
{
public static void main(String[] args)
{
A t=new A();
t.m();
}
}