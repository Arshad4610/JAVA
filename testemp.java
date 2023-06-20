import java.util.Scanner;
class employee
{
String name,id,designation;
void reademp()
{
System.out.println("enter name  id designation");
Scanner s=new Scanner(System.in);
name=s.nextLine();
id=s.nextLine();
designation=s.nextLine();
}
}
class salary extends employee
{
int np,bp,hra,da,pf;
void readsalary()
{
System.out.println("enter bp hra da pf");
Scanner sc=new Scanner(System.in);
bp=sc.nextInt();
hra=sc.nextInt();
da=sc.nextInt();
pf=sc.nextInt();
}
void calculatedsalary()
{
System.out.println("np="+(bp+hra+da-pf));
}
void displayemp()
{
System.out.println("name="+name+"id"+id+"designation"+designation);
}
}

class testemp
{
public static void main(String[] args)
{
salary p[]=new salary[500];
for(int i=0;i<2;i++)
{
p[i]=new salary();
p[i].reademp();
p[i].readsalary();
p[i].calculatedsalary();
p[i].displayemp();
}
}
}



