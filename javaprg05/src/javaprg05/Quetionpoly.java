package javaprg05;
import java.util.Scanner;
public class Quetionpoly {
	 int  dend, dvsor,q,r;
	void get()
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Divident:");
         dend=s.nextInt();
         System.out.println("Enter Divisor:");
         dvsor=s.nextInt();
         s.close();
	}
	void print()
	{
		 q = dend / dvsor;
	     r = dend % dvsor;

	    System.out.println("Quotient = " + q);
	    System.out.println("Remainder = " + r);
	}
	public static void main(String []args)
	{
	Quetionpoly q=new Quetionpoly();
	q.get();
	q.print();
	}

}
