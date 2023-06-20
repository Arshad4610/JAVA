class test
{
int a,b;
test(int i,int j)
{
a=i;
b=j;
}
void meth(test o)
{
o.a *=2;
o.b /=2;
}
}
class passbyref
{
public static void main(String[] args)
{
test t = new test(15,20);
System.out.println("before call:"+t.a+" "+t.b);
t.meth(t);
System.out.println("after call:"+t.a+" "+t.b);
}
}