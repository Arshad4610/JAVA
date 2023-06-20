import java.util.Scanner;
class student
{
String name,rollno;
void getinfo()
{
Scanner s=new Scanner(System.in);
System.out.println("enter name rollno");
name=s.nextLine();
rollno=s.nextLine();
}
}
class test extends student
{
int m1,m2,m3,m4;
void getmarks()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter marks:");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
}
}
class result extends test
{
void total()
{
System.out.println("total="+(m1+m2+m3+m4));
}
public static void main(String[] args)
{
result p[]=new result[400];
for(int i=0;i<2;i++)
{
p[i]=new result();
p[i].getinfo();
p[i].getmarks();
p[i].total(); 
}
}
}