import java.util.Scanner;
class sample
{
S`tring name;
int age;
double salary;

void read()
{
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
name=s.nextLine();
System.out.println("enter age");
age=s.nextInt();
System.out.println("enter salary");
salary=s.nextDouble();
}
void print()
{
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("salary:"+salary);
}
}
class testsample
{
public static void main(String[] args)
{
sample s1=new sample();
s1.read();
s1.print();
}
}