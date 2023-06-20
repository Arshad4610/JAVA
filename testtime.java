class time
{
int h=0,m=0,s=0;
time()
{
h=m=s=0;
}
time(int h,int m,int s)
{
this.h=h;
this.m=m;
this.s=s;
}
time(int x)
{
h=m=s=x;
}
void display()
{
System.out.println("time:"+h+"h:"+m+"m:"+s+"s");
}
}
class testtime
{
public static void main(String[] args)
{
time t=new time();
t.display();
time t1=new time(3,4,5);
t1.display();
time t2=new time(5);
t2.display();
}
}
