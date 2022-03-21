import java.lang.*;
import java.io.*;
class A
{
public static void main(String args[]) throws IOException
{
System.out.println("enter the vlaue of a");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
System.out.printf("the value of a is %d\n",a);
System.out.printf("the value of b is %d\n",b);

}

}