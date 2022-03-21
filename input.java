import java.io.*;
import java.lang.*;
class A
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
char ch=(char)br.read();
System.out.println(ch);
}
}