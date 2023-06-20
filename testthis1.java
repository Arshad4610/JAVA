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
class testthis1
{
public static void main(String[] args)
{
student s=new student(1,2,3);
s.display();
}
}