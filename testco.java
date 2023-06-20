class co
{
double w,h,d;
co()
{
System.out.println("con. with no par");
w=h=d=-1;
}
co(double len)
{
System.out.println("con. with 1 par");
w=h=d=len;
}
co(double w1,double h1,double d1)
{
System.out.println("con. with 3 double type par");
w=w1;
h=h1;
d=d1;
}
double volume()
{
return w*h*d;
}
}
class testco
{
public static void main(String[] args)
{
double vol;
co c1=new co();
vol=c1.volume();
System.out.println("vol:"+vol);
co c2=new co(7);
vol=c2.volume();
System.out.println("vol:"+vol);
co c3=new co(10,10,10);
vol=c3.volume();
System.out.println("vol:"+vol);
}
}


