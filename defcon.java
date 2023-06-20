class box
{
double width,height,depth;
box()
{
System.out.println("default construtor");
width=10;
height=10;
depth=10;
}
double volume()
{
return width*height*depth;
}
}
class boxdemo
{
public static void main(String[] args)
{
double vol;
System.out.println("default constructor is called");
box b1=new box();
vol=b1.volume();
System.out.println("vol:"+vol);
box b2=new box();
vol=b2.volume();
System.out.println("vol:"+vol);
}
}