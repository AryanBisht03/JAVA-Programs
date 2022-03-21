import java.io.*;
import java.lang.*;
class A
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStringReader(System.in));
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=a-b;
System.out.println("the subtraction of a and b is "+c);
}
}