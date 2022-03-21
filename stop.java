import java.io.*;
import java.lang.*;
class A
{
public static void main(String args[]) throws IOException
{
//program to input data from the user until the user types stop
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name="";
while(name.equals("stop"))
{
System.out.println("enter data:");
name=br.readLine();
System.out.println(name);
}
}
}