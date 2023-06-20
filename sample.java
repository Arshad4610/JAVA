import java.util.Scanner;
class sample
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
String name=s.nextLine();
System.out.println("enter age:");
int age=s.nextInt();
System.out.println("enter salary:");
double salary=s.nextDouble();
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("salary:"+salary);
}
}
