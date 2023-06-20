import java.util.Scanner;
class stringmtd
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
System.out.println("enter string:");
System.out.println("length="+s1.length());
System.out.println("lower case="+s1.toLowerCase());
System.out.println("upper case="+s1.toUpperCase());
System.out.println("remove spaces beg & end="+s1.trim());
System.out.println("replace="+s1.replace("devil","monster"));
System.out.println("index="+index(4));
}
}