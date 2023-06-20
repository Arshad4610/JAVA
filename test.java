class student
{
int a,b,c;
student(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
}
void display()
{
System.out.println("a:"+a);
System.out.println("b:"+b);
System.out.println("c:"+c);
}
}
class test
{
public static void main(String[] args)
{
student t=new student(1,2,3);
t.display();
}
}