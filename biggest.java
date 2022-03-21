import java.lang.*;
import java.io.*;
class A
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the value of a");
int a=Integer.parseInt(br.readLine());
System.out.println("enter the value of b");
int b=Integer.parseInt(br.readLine());
System.out.println("enter the value of c");
int c=Integer.parseInt(br.readLine());
int large=a;
if(b>large)
large=b;
else if(c>large)
large=c;
System.out.println("the biggest number is "+large);
System.out.printf("the biggest number is %d ",large);

}
}