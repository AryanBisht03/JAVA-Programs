import java.lang.*;
import java.io.*;
class A
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char color=(char) br.read();
switch(color)
{
case 'r':
System.out.println("red");
break;

case 'b':
System.out.println("blue");
break;

case 'v':
System.out.println("voilet");
break;

case 'g':
System.out.println("green");
break;

case 'y':
System.out.println("yellow");
break;

case 'n':
System.out.println("narangi");
break;

case 'c':
System.out.println("chitkabra");
break;

default:
System.out.println("no color");
}
}
}