import java.io.*;
import java.lang.*;
class A
{
//multiplication of 2 numbers
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the value of a");
int a=Integer.parseInt(br.readLine());
System.out.println("enter the value of b");
int b=Integer.parseInt(br.readLine());
int c=a*b;
System.out.println("the multiplication is "+c);
}