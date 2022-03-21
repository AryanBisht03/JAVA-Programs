import java.io.*;
import java.lang.*;
class A
{
public static void main(String args[]) throws IOException
{
System.out.println("enter the value of a");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
System.out.println("enter the character");
BufferedReader cr= new BufferedReader(new InputStreamReader(System.in));
char ch=(char) cr.read();
BufferedReader cra= new BufferedReader(new InputStreamReader(System.in));
int chn= cra.read();

System.out.println("enter the string");
BufferedReader dr= new BufferedReader(new InputStreamReader(System.in));
String name=dr.readLine();
System.out.println("enter the character");
BufferedReader er= new BufferedReader(new InputStreamReader(System.in));
char cha=(char) er.read();
BufferedReader era= new BufferedReader(new InputStreamReader(System.in));
int chm=era.read();

System.out.println("the value of a is "+a);
System.out.println("the value of character is "+ch);
System.out.println("the ASCII value of character is "+chn);
System.out.println("the value of string  is "+name);
System.out.println("the value of character is "+cha);
System.out.println("the ASCII value of character is "+chm);


}
}