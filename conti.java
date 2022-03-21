import java.lang.*;
import java.io.*;
class A
{
public static void main(String args[]) throws IOException
{
int i=1;
while(i<=100)
{
if(i%9==0)
continue;
System.out.println(i);
i++;
}
}
}