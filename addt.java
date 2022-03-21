import java.io.*;
import java.lang.*;
class Add
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=br.read();
int b=br.read();
int c=a+b;
System.out.println("the sum of a and b is "+c);

}
}