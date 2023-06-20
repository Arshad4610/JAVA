class overload
{
void test()
{
System.out.println("method with no parameters");
}
void test(int a)
{
System.out.println("method with 1 parameter");
System.out.println("a:"+a);
}
void test(double a)
{
System.out.println("method with 1 double parameter");
System.out.println("double a:"+a);
}
}
class overloaddemo
{
public static void main(String[] args)
{
overload o=new overload();
o.test();
o.test(10);
o.test(123.45);
}
}