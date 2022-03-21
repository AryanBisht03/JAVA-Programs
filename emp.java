import java.io.*;
import java.lang.*;
class A
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter id");
int id=Integer.parseInt(br.readLine());
System.out.println("enter Gender(M/F)");
BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
char ch=(char)cr.read();
System.out.println("enter name");
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
String name=dr.readLine();
System.out.println("id:"+id);
System.out.println("gender:"+ch);
System.out.println("name:"+name);

}
}