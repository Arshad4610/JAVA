class pox
{
double width,height,depth;
pox(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
double volume()
{
return width*height*depth;
}
}
class poxdemo
{
public static void main(String[] args)
{
double vol;
pox b1=new pox(10,10,10);
vol=b1.volume();
System.out.println("vol:"+vol);
pox b2=new pox(10,10,10);
vol=b2.volume();
System.out.println("vol:"+vol);
}
}
