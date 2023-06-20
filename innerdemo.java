class outer
{
static int outer_x=10;
private int outer_y=20;
void test()
{
inner i=new inner();
i.display();
}
class inner
{
void display()
{
System.out.println("outer_x="+outer_x);
System.out.println("outer_y="+outer_y);
}
}
}
class innerdemo
{
public static void main(String[] args)
{
outer o=new outer();
o.test();
}
}