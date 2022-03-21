import java.lang.*;
import java.util.Scanner;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a");
int a=sc.nextInt();
System.out.println("enter the value of b");
int b=sc.nextInt();
System.out.println("enter a character");
char ch=sc.next().charAt(0);
System.out.println("enter the value of c");
float c=sc.nextFloat();
System.out.println("enter the string");
String s=sc.next();
System.out.println("enter the string");
String m=sc.nextLine();

System.out.println("value of a is "+a);
System.out.println("value of b is "+b);
System.out.println("value of character is "+ch);
System.out.println("value of c is "+c);
System.out.println("value of string is "+s);
System.out.println("value of string is "+m);

}
}