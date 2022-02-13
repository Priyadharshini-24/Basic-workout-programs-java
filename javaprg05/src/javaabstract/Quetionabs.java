package javaabstract;
import java.util.Scanner;
public abstract class Quetionabs {
	abstract void get();
	abstract void print();
}
class Quetionmain extends Quetionabs
{
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

	public static void main(String[] args) {
		Quetionabs qa=new Quetionmain();
		qa.get();
		qa.print();
	}

}
