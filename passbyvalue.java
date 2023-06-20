class test
{
void meth(int i,int j)
{
i *=2;
j /=2;
}
}
class passbyvalue
{
public static void main(String[] args)
{
test t=new test();
int a=15,b=20;
System.out.println("before call:"+a+" "+b);
t.meth(a,b);
System.out.println("after call:"+a+" "+b);
}
}