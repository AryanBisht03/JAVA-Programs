import java.io.*;
import java.lang.*;
class A
{
public static void main(String args[]) throws IOException
{
System.out.println("enter the value of a");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
System.out.println("enter the value of b");
int b=Integer.parseInt(br.readLine());
int c=a*b;
System.out.println("the multiplication of a and b is "+c);
}
}