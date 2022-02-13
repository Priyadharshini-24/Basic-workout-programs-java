
package basic;
import java.io.*;
public class Sample
{
	void add1() throws Exception
	{
	
		DataInputStream dis=new DataInputStream(System.in);
	int a,b,c;
		System.out.println("enter a value:");
		a=Integer.parseInt(dis.readLine());
		System.out.println("enter b value:");
		b=Integer.parseInt(dis.readLine());
		c=a+b;
		System.out.println("addition of two no :"+c);
		
	}
public static void main(String args [])throws Exception
{
	Sample s=new Sample();
	s.add1();
	
	}
}